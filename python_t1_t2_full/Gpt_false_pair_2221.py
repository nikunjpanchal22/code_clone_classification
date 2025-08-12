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




def send_mail(send_from, send_to, subject, message, files=[],
              server="localhost", port=587, username="", password="",
              use_tls=True):
    msg = MIMEMultipart()
    msg["From"] = send_from
    msg["To"] = COMMASPACE.join(send_to)
    msg["Date"] = formatdate(localtime=True)
    msg["Subject"] = subject
    msg.attach(MIMEText(message))
    for filename in files:
        part = MIMEBase('application', "octet-stream")
        file = open(filename, 'rb')
        part.set_payload(file.read())
        encoders.encode_base64(part)
        part.add_header('Content-Disposition',
                        'attachment; filename="{}"'.format(op.basename(filename)))
        msg.attach(part)
        file.close()
    smtp = smtplib.SMTP(server, port)
    if use_tls:
        smtp.starttls()
    smtp.sendmail(send_from, send_to, msg.as_string())
    smtp.quit()
