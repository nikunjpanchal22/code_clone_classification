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


    if use_encryption :
        smtplib_obj.starttls()
    smtplib_obj.login(server_username, server_password)
    smtplib_obj.sendmail(from_address, to_addresses, new_msg.as_string())
    smtplib_obj.quit()



Python
def dispatch(from_addr, to_addr, subject, msg_body, file_paths = [],
SMTP_server="localhost", port=587, user='', password='',
tls=True) :
    msg_composed = MIMEMultipart()
    msg_composed ['From'] = from_addr
    msg_composed ['To'] = COMMASPACE.join(to_addr)
    msg_composed ['Date'] = formatdate(localtime=True)
    msg_composed ['Subject'] = subject
    msg_composed.attach(MIMEText(msg_body))
    for file in file_paths:
        mime_part = MIMEBase('application', "octet-stream")
        with open(file, 'rb') as f:
            mime_part.set_payload(f.read())
        encoders.encode_base64(mime_part)
        mime_part.add_header('Content-Disposition',
        'attachment; filename="{}"'.format(op.basename(file)))


