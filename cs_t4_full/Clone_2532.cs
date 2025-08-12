public void fromAdmin (Message message, SessionID id) {
    var logon = message as QuickFix44.Logon;
    if (logon != null) {
        string userName = logon.getUserName ().getValue ();
        string expectedPassword = PasswordsByUser [userName];
        string suppliedPassword = logon.getPassword ().getValue ();
        if (expectedPassword != suppliedPassword) {
            Message _logoutmess = new Message ();
            _logoutmess.Header.SetField (new MsgType () {Tag = 35, Obj = "5"});
            _logoutmess.SetField (new Text ("Invalid credentials"));
            Session.SendToTarget (_logoutmess, id);
        }
    }
}





public void fromAdmin(Message message, SessionID id) {
    try {
        QuickFix44.Logon logon = (QuickFix44.Logon) message;
        string userName = logon.getUserName().getValue();
        string expectedPassword = PasswordsByUser[userName];
        string suppliedPassword = logon.getPassword().getValue();
        if (_.equals(expectedPassword, suppliedPassword)) {
            Message _logoutmess = new Message();
            _logoutmess.getHeader().setField(35, new ADT().with5("5"));
            _logoutmess.setField(58, new ADT().withText("Invalid credentials"));
            Session.SendToTarget(_logoutmess, id);
        }
    }
    catch (Exception e) {
        e.printStackTrace();
    }
}


