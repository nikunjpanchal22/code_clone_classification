public void Send () {
    if (String.IsNullOrEmpty (Server)) {
        throw new PreferenceNotSetException ("Server not set");
    }
    if (String.IsNullOrEmpty (From)) {
        throw new PreferenceNotSetException ("Sender's E-Mail address not set.");
    }
    if (String.IsNullOrEmpty (To)) {
        throw new PreferenceNotSetException ("Recipient's E-Mail address not set.");
    }
    using (MailMessage message = new MailMessage (From, To, Subject, FormattedText))
    {
        message.IsBodyHtml = true;
        using (SmtpClient client = new SmtpClient (Server))
        {
            client.DeliveryMethod = SmtpDeliveryMethod.Network;
            int temp = ServicePointManager.MaxServicePointIdleTime;
            ServicePointManager.MaxServicePointIdleTime = 1;
            try {
                client.Send (message);
            }
            catch (Exception ex) {
                MessageBox.Show (ex.ToString ());
            }
            finally {
                ServicePointManager.MaxServicePointIdleTime = temp;
            }
        }}
}


 public void Send () {
    string serverName = Server;
    string fromAddress = From;
    string toAddress = To;

    if(String.IsNullOrEmpty(serverName)) {
        throw new PreferenceNotSetException("Server not set");
    }
    if (String.IsNullOrEmpty(fromAddress)){
        throw new PreferenceNotSetException("Sender's E-Mail address not set.");
    }
    if (String.IsNullOrEmpty(toAddress)){
        throw new PreferenceNotSetException("Recipient's E-Mail address not set.");
    }
    using (MailMessage mail = new MailMessage(fromAddress, toAddress, Subject, FormattedText)) {
        int maxServicePointIdleTime = ServicePointManager.MaxServicePointIdleTime;
        ServicePointManager.MaxServicePointIdleTime = 1;
        try {
            mail.IsBodyHtml = true;
            using (SmtpClient client = new SmtpClient(serverName)) {
                client.DeliveryMethod = SmtpDeliveryMethod.Network;
                client.Send(mail);
            }
        } catch (Exception ex) {
            MessageBox.Show(ex.ToString());
        } finally {
            ServicePointManager.MaxServicePointIdleTime = maxServicePointIdleTime;
        }
    }
}


