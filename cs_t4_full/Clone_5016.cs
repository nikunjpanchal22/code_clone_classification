public void SendEmail (MyInternalSystemEmailMessage email) {
    var mailMessage = new System.Net.Mail.MailMessage ();
    mailMessage.From = new System.Net.Mail.MailAddress (email.FromAddress);
    mailMessage.To.Add (email.ToRecipients);
    mailMessage.ReplyToList.Add (email.FromAddress);
    mailMessage.Subject = email.Subject;
    mailMessage.Body = email.Body;
    mailMessage.IsBodyHtml = email.IsHtml;
    foreach (System.Net.Mail.Attachment attachment in email.Attachments) {
        mailMessage.Attachments.Add (attachment);
    }
    var mimeMessage = MimeKit.MimeMessage.CreateFromMailMessage (mailMessage);
    var gmailMessage = new Google.Apis.Gmail.v1.Data.Message {Raw = Encode (mimeMessage.ToString ())};
    Google.Apis.Gmail.v1.UsersResource.MessagesResource.SendRequest request = service.Users.Messages.Send (gmailMessage, ServiceEmail);
    request.Execute ();
}


 public void SendEmail (MyInternalSystemEmailMessage email)
{
	var mailMessage = new System.Net.Mail.MailMessage {
		From = new System.Net.Mail.MailAddress (email.FromAddress),
		To = { email.ToRecipients },
		Subject = email.Subject,
		Body = email.Body,
		IsBodyHtml = email.IsHtml
	};

	foreach (System.Net.Mail.Attachment attachment in email.Attachments)
	{
		mailMessage.Attachments.Add(attachment);
	}

	var mimeMessage = MimeKit.MimeMessage.CreateFromMailMessage (mailMessage);
	using (SmtpClient smtp = new SmtpClient
	{
		DeliveryMethod = SmtpDeliveryMethod.Network,
		UseDefaultCredentials = false,
		Port = 587,
		Host = "smtp.gmail.com"
	})
	{
		NetworkCredential creds = new NetworkCredential("your@username", "password", "");
		smtp.Credentials = creds;
		smtp.Send(mimeMessage);
	} 
}


