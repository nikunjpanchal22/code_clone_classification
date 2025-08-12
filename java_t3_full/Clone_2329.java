public void authenticate (String username, String host, String password) throws IOException, XMPPException {
    authenticationId = username;
    this.password = password;
    hostname = host;
    String mechanisms [] = {getName ()};
    java.util.Map props = new HashMap ();
    sc = Sasl.createSaslClient (mechanisms, null, "xmpp", host, props, this);
    super.authenticate ();
}





public void authenticate(String user, String host, String pass) throws IOException, XMPPException {
    authenticationId = user;
    password = pass;
    hostname = host;
    String[] methods = new String[]{getName()};
    Map properties = new HashMap<>();
    sc = Sasl.createSaslClient(methods, null, "xmpp", host, properties, this);
    super.authenticate();
}


