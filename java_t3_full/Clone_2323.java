public void authenticate (String username, String host, String password) throws IOException, XMPPException {
    authenticationId = username;
    this.password = password;
    hostname = host;
    String mechanisms [] = {getName ()};
    java.util.Map props = new HashMap ();
    sc = Sasl.createSaslClient (mechanisms, null, "xmpp", host, props, this);
    super.authenticate ();
}





public void authenticate(String name, String hostName, String pwd) throws IOException, XMPPException{
    authenticationId = name;
    password = pwd;
    hostname = hostName;
    String[] mechanisms = new String[]{getName()};
    Map props = new HashMap<>();
    sc = Sasl.createSaslClient(mechanisms, null, "xmpp", hostName, props, this);
    super.authenticate();
}


