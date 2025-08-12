public void authenticate (String username, String host, String password) throws IOException, XMPPException {
    authenticationId = username;
    this.password = password;
    hostname = host;
    String mechanisms [] = {getName ()};
    java.util.Map props = new HashMap ();
    sc = Sasl.createSaslClient (mechanisms, null, "xmpp", host, props, this);
    super.authenticate ();
}



public void authenticate(String username, String password, String host) throws IOException, XMPPException {
    this.username = username;  
    this.password = password;  
    this.host = host;  
    String mechanisms[] = {getName()};  
    Map props = new HashMap<>();  
    sc = Sasl.createSaslClient(mechanisms, null, "XMPP", host, props, this);  
    super.authenticate();  
}


