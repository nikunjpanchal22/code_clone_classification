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


def send(recipient, heading, body, attachment):
    if not isinstance(recipient, list):
        recipient = [recipient]
    if not isinstance(attachment, list):
        attachment = [attachment]
    username = "username@gmail.com"
    password = "password"
    message = MIMEMultipart()
    message["From"] = username
    message["To"] = ", ".join(recipient)
    message["Subject"] = heading
    message.attach(MIMEText(body))
    for file in attachment:
        print(file)
        part = MIMEBase("application", "octet-stream")
        part.set_payload(open(file, "rb").read())
        Encoders.encode_base64(part)
        part.add_header(
            "Content-Disposition", 'attachment; filename="%s"' % os.path.basename(file)
        )
        message.attach(part)
    sendServer = smtplib.SMTP("smtp.gmail.com", 587)
    sendServer.ehlo()
    sendServer.starttls()
    sendServer.ehlo()
    sendServer.login(username, password)
    sendServer.sendmail(username, recipient, message.as_string())
    sendServer.close()


