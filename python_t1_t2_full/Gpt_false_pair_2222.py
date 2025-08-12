def send_mail(send_from, send_to, subject, message, files = [],
server = "localhost", port = 587, username = '', password = '',
use_tls = True) :
	msg = MIMEMultipart()
	msg ['From'] = send_from
	msg ['To'] = COMMASPACE.join(send_to)
	msg ['Date'] = formatdate(localtime = True)
	msg ['Subject'] = subject
	msg.attach(MIMEText(message))
	for path in files :
		part = MIMEBase('application', "octet-stream")
		with open(path, 'rb') as file :
			part.set_payload(file.read())
		encoders.encode_base64(part)
		part.add_header('Content-Disposition',
		'attachment; filename="{}"'.format(op.basename(path)))
		msg.attach(part)
	smtp = smtplib.SMTP(server, port)
	if use_tls :
		smtp.starttls()
	smtp.login(username, password)
	smtp.sendmail(send_from, send_to, msg.as_string())
	smtp.quit()




def send_mail(send_from, send_to, subject, message, files = [],
server = "localhost", port = 587, username = '', password = '',
use_tls = True) :
	mime_message = MIMEMultipart()
	mime_message ['From'] = send_from
	mime_message ['To'] = COMMASPACE.join(send_to)
	mime_message ['Date'] = formatdate(localtime = True)
	mime_message ['Subject'] = subject
	mime_message.attach(MIMEText(message))
	for item in files :
		sub_part = MIMEBase('application', "octet-stream")
		with open(item, 'rb') as cs_file :
			sub_part.set_payload(cs_file.read())
		encoders.encode_base64(sub_part)
		sub_part.add_header('Content-Disposition',
		'attachment; filename="{}"'.format(op.basename(item)))
		mime_message.attach(sub_part)
	mail_server = smtplib.SMTP(server, port)
	if use_tls :
		mail_server.starttls()
	mail_server.login(username, password)
	mail_server.sendmail(send_from, send_to, mime_message.as_string())
	mail_server.quit()

