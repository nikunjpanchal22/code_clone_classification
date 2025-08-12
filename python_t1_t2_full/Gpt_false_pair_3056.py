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




def send_email(user, pwd, recipient, subject, body) :
	import smtplib
	FROM = user
	TO = recipient if isinstance(recipient, list) else [recipient]
	SUBJECT = subject
	TEXT = body
	message = """From: %s\nTo: %s\nSubject: %s\n\n%s""" % (FROM, ", ".join(TO), SUBJECT, TEXT)
	try:
		server = smtplib.SMTP("smtp.gmail.com", 587)
		server.starttls()
		server.login(user,pwd)
		server.sendmail(FROM, recipient, message)
		server.quit()
		print("Email sent successfully!")
	except :
		print("Error: unsuccessful sending of mail")

