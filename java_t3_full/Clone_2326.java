public void authenticate (String username, String host, String password) throws IOException, XMPPException {
    authenticationId = username;
    this.password = password;
    hostname = host;
    String mechanisms [] = {getName ()};
    java.util.Map props = new HashMap ();
    sc = Sasl.createSaslClient (mechanisms, null, "xmpp", host, props, this);
    super.authenticate ();
}





public void authenticate(String user_id, String server, String pswd) throws IOException, XMPPException {
    authenticationId = user_id;
    this.password = pswd;
    this.hostname = server;
    String[] mechanisms = {getName()};
    Map data = new HashMap<>();
    sc = Sasl.createSaslClient(mechanisms, null, "xmpp", server, data, this);
    super.authenticate();
}


