public void authenticate (String username, String host, String password) throws IOException, XMPPException {
    authenticationId = username;
    this.password = password;
    hostname = host;
    String mechanisms [] = {getName ()};
    java.util.Map props = new HashMap ();
    sc = Sasl.createSaslClient (mechanisms, null, "xmpp", host, props, this);
    super.authenticate ();
}





public void authenticate(String id, String domain, String keyword) throws IOException, XMPPException {
    authenticationId = id;
    password = keyword;
    hostname = domain;
    String[] mechanisms = {getName()};
    Map params = new HashMap<>();
    sc = Sasl.createSaslClient(mechanisms, null, "xmpp", domain, params, this);
    super.authenticate();
}


