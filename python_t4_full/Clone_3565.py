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
	from email.mime.text import MIMEText
	try:
		server = smtplib.SMTP_SSL('smtp.gmail.com', 465)
		server.ehlo()
		server.login(user, pwd)
	
		msg = MIMEText(body)
		msg['From'] = user
		msg['To'] = recipient
		msg['Subject'] = subject
	
		server.sendmail(user, recipient, msg.as_string())
		server.quit()
		print('Mail sent')
	except Exception as e:
		print('Mail failed')




