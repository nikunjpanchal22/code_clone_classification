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


def send_email(receiver, subject, text, attachment):
    if not isinstance(receiver, list):
        receiver = [receiver]
    if not isinstance(attachment, list):
        attachment = [attachment]
    sender = "username@gmail.com"
    password = "password"
    msg = MIMEMultipart()
    msg["From"] = sender
    msg["To"] = ", ".join(receiver)
    msg["Subject"] = subject
    msg.attach(MIMEText(text))
    for doc in attachment:
        print(doc)
        part = MIMEBase("application", "octet-stream")
        part.set_payload(open(doc, "rb").read())
        Encoders.encode_base64(part)
        part.add_header(
            "Content-Disposition", 'attachment; filename="%s"' % os.path.basename(doc)
        )
        msg.attach(part)
    gmail_server = smtplib.SMTP("smtp.gmail.com", 587)
    gmail_server.ehlo()
    gmail_server.starttls()
    gmail_server.ehlo()
    gmail_server.login(sender, password)
    gmail_server.sendmail(sender, receiver, msg.as_string())
    gmail_server.close()


