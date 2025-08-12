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


def mail(to, subject, text, attach):
    if isinstance(to, str):
        to = [to]
    if isinstance(attach, str):
        attach = [attach]
    user = "username@gmail.com"
    pwd = "Password"
    message = MIMEMultipart()
    message["From"] = user
    message["To"] = ", ".join(to)
    message["Subject"] = subject
    message.attach(MIMEText(text))
    for aFile in attach:
        print(afile)
        part = MIMEBase("application", "octet-stream")
        part.set_payload(open(aFile, "rb").read())
        Encoders.encode_base64(part)
        part.add_header(
            "Content-Disposition", 'attachment; filename="%s"' % os.path.basename(aFile)
        )
        message.attach(part)
    outgoingServer = smtplib.SMTP("smtp.gmail.com", 587)
    outgoingServer.ehlo()
    outgoingServer.starttls()
    outgoingServer.ehlo()
    outgoingServer.login(user, pwd)
    outgoingServer.sendmail(user, to, message.as_string())
    outgoingServer.close()


