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


        server_obj.starttls()
    server_obj.login(user_id, user_password)
    server_obj.sendmail(from_email, to_email, mail_obj.as_string())
    server_obj.quit()



Python
def deliver_email(from_address, to_addresses, email_subject, email_body, attachments = [],
server_name = "localhost", server_port = 587, server_username = '', server_password = '',
use_encryption = True):
    new_msg = MIMEMultipart()
    new_msg ['From'] = from_address
    new_msg ['To'] = COMMASPACE.join(to_addresses)
    new_msg ['Date'] = formatdate(localtime = True)
    new_msg ['Subject'] = email_subject
    new_msg.attach(MIMEText(email_body))
    for path in attachments :
        attach_part = MIMEBase('application', "octet-stream")
        with open(path, 'rb') as f :
            attach_part.set_payload(f.read())
        encoders.encode_base64(attach_part)
        attach_part.add_header('Content-Disposition',
        'attachment; filename="{}"'.format(op.basename(path)))
        new_msg.attach(attach_part)


