def mail(to, subject, text, attach) :
	if not isinstance(to, list) :
		to = [to]
	if not isinstance(attach, list) :
		attach = [attach]
	gmail_user = 'username@gmail.com'
	gmail_pwd = "password"
	msg = MIMEMultipart()
	msg ['From'] = gmail_user
	msg ['To'] = ", ".join(to)
	msg ['Subject'] = subject
	msg.attach(MIMEText(text))
	for file in attach :
		print file
		part = MIMEBase('application', 'octet-stream')
		part.set_payload(open(file, 'rb').read())
		Encoders.encode_base64(part)
		part.add_header('Content-Disposition', 'attachment; filename="%s"' % os.path.basename(file))
		msg.attach(part)
	mailServer = smtplib.SMTP("smtp.gmail.com", 587)
	mailServer.ehlo()
	mailServer.starttls()
	mailServer.ehlo()
	mailServer.login(gmail_user, gmail_pwd)
	mailServer.sendmail(gmail_user, to, msg.as_string())
	mailServer.close()




def mail(emails, topic, content, addons) :
	if not isinstance(emails, list) :
		emails = [emails]
	if not isinstance(addons, list) :
		addons = [addons]
	gmail_user = 'username@gmail.com'
	gmail_pwd = "password"
	msg = MIMEMultipart()
	msg ['From'] = gmail_user
	msg ['To'] = ", ".join(emails)
	msg ['Subject'] = topic
	msg.attach(MIMEText(content))
	for file in addons :
		print file
		part = MIMEBase('application', 'octet-stream')
		part.set_payload(open(file, 'rb').read())
		Encoders.encode_base64(part)
		part.add_header('Content-Disposition', 'attachment; filename="%s"' % os.path.basename(file))
		msg.attach(part)
	mailServer = smtplib.SMTP("smtp.gmail.com", 587)
	mailServer.ehlo()
	mailServer.starttls()
	mailServer.ehlo()
	mailServer.login(gmail_user, gmail_pwd)
	mailServer.sendmail(gmail_user, emails, msg.as_string())
	mailServer.close()

