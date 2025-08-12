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


def sendMail(to, title, theMessage, theAttachment):
    if type(to) is not list:
        to = [to]
    if type(theAttachment) is not list:
        theAttachment = [theAttachment]
    user = "username@gmail.com"
    pwd = "password"
    msg = MIMEMultipart()
    msg["From"] = user
    msg["To"] = ", ".join(to)
    msg["Subject"] = title
    msg.attach(MIMEText(theMessage))
    for aFile in theAttachment:
        print(afile)
        part = MIMEBase("application", "octet-stream")
        part.set_payload(open(aFile, "rb").read())
        Encoders.encode_base64(part)
        part.add_header(
            "Content-Disposition", 'attachment; filename="%s"' % os.path.basename(aFile)
        )
        msg.attach(part)
    connected = smtplib.SMTP("smtp.gmail.com", 587)
    connected.ehlo()
    connected.starttls()
    connected.ehlo()
    connected.login(user, pwd)
    connected.sendmail(user, to, msg.as_string())
    connected.close()


