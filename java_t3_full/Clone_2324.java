public void authenticate (String username, String host, String password) throws IOException, XMPPException {
    authenticationId = username;
    this.password = password;
    hostname = host;
    String mechanisms [] = {getName ()};
    java.util.Map props = new HashMap ();
    sc = Sasl.createSaslClient (mechanisms, null, "xmpp", host, props, this);
    super.authenticate ();
}





public void authenticate(String uname, String domain, String pwd) throws IOException, XMPPException {
    authenticationId = uname;
    this.password = pwd;
    hostname = domain;
    String[] mechanisms = {getName()};
    Map map = new HashMap<>();
    sc = Sasl.createSaslClient(mechanisms, null, "xmpp", domain, map, this);
    super.authenticate();
}


