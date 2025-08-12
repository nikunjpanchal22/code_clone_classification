public void authenticate (String username, String host, String password) throws IOException, XMPPException {
    authenticationId = username;
    this.password = password;
    hostname = host;
    String mechanisms [] = {getName ()};
    java.util.Map props = new HashMap ();
    sc = Sasl.createSaslClient (mechanisms, null, "xmpp", host, props, this);
    super.authenticate ();
}


 public void authenticate (String username, String host, String password) throws IOException, XMPPException {
authenticationId = username;
    this.password = password;
    hostname = host;

    String [] mechanisms = { SASLConstants.MECHANISMS.ntlm };
    Map<String, String> props = new HashMap<>();
    props.put(SASLConstants.SERVICE, "xmpp");
    props.put(SASLConstants.HOST, host);
    sc = Sasl.createSaslClient(mechanisms, null, "xmpp", hostname, props, this);
    super.authenticate();
}


