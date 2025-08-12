def mail(to, subject, text, attach):
    if not isinstance(to, list):
        to = [to]
    if not isinstance(attach, list):
        attach = [attach]
    gmail_user = "username@gmail.com"
    gmail_pwd = "password"
    msg = MIMEMultipart()
    msg["From"] = gmail_user
    msg["To"] = ", ".join(to)
    msg["Subject"] = subject
    msg.attach(MIMEText(text))
    for file in attach:
        print(file)
        part = MIMEBase("application", "octet-stream")
        part.set_payload(open(file, "rb").read())
        Encoders.encode_base64(part)
        part.add_header(
            "Content-Disposition", 'attachment; filename="%s"' % os.path.basename(file)
        )
        msg.attach(part)
    mailServer = smtplib.SMTP("smtp.gmail.com", 587)
    mailServer.ehlo()
    mailServer.starttls()
    mailServer.ehlo()
    mailServer.login(gmail_user, gmail_pwd)
    mailServer.sendmail(gmail_user, to, msg.as_string())
    mailServer.close()


def email(recipient, topic, body, attach):
    if not isinstance(recipient, list):
        recipient = [recipient]
    if not isinstance(attach, list):
        attach = [attach]
    userName = "username@gmail.com"
    password = "password"
    mail = MIMEMultipart()
    mail["From"] = userName
    mail["To"] = ", ".join(recipient)
    mail["Subject"] = topic
    mail.attach(MIMEText(body))
    for doc in attach:
        print(doc)
        part = MIMEBase("application", "octet-stream")
        part.set_payload(open(doc, "rb").read())
        Encoders.encode_base64(part)
        part.add_header(
            "Content-Disposition", 'attachment; filename="%s"' % os.path.basename(doc)
        )
        mail.attach(part)
    server = smtplib.SMTP("smtp.gmail.com", 587)
    server.ehlo()
    server.starttls()
    server.ehlo()
    server.login(userName, password)
    server.sendmail(userName, recipient, mail.as_string())
    server.close()


