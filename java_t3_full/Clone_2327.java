public void authenticate (String username, String host, String password) throws IOException, XMPPException {
    authenticationId = username;
    this.password = password;
    hostname = host;
    String mechanisms [] = {getName ()};
    java.util.Map props = new HashMap ();
    sc = Sasl.createSaslClient (mechanisms, null, "xmpp", host, props, this);
    super.authenticate ();
}





public void authenticate (String usr, String hst, String pass) throws IOException, XMPPException {
    authenticationId = usr;
    this.password = pass;
    hostname = hst;
    String[] mechanisms = {getName()};
    Map properties = new HashMap<>();
    sc = Sasl.createSaslClient(mechanisms, null, "xmpp", hst, properties, this);
    super.authenticate();
}


