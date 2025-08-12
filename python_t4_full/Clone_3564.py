def send_email(user, pwd, recipient, subject, body) :
	import smtplib
	FROM = user
	TO = recipient if isinstance(recipient, list) else [recipient]
	SUBJECT = subject
	TEXT = body
	message = """From: %s\nTo: %s\nSubject: %s\n\n%s
	""" % (FROM, ", ".join(TO), SUBJECT, TEXT)
	try :
		server = smtplib.SMTP("smtp.gmail.com", 587)
		server.ehlo()
		server.starttls()
		server.login(user, pwd)
		server.sendmail(FROM, TO, message)
		server.close()
		print 'successfully sent the mail'
	except :
		print "failed to send mail"



def send_email(user, pwd, recipient, subject, body):
	import smtplib
	server = smtplib.SMTP('smtp.gmail.com', 587)
	server.ehlo()
	server.starttls()
	server.login(user, pwd)
	msg = "\r\n".join([
		"From: " + user,
		"To: " + recipient,
		"Subject: " + subject,
		"",
		body
	])
	try:
		server.sendmail(user, [recipient], msg)
		print("Email successfully sent")
	except Exception as e:
		print("Failed: " + str(e))




