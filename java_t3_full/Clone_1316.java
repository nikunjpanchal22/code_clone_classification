public static void main (String [] args) throws Exception {
    AuthMethod auth = new TokenAuthMethod (API_KEY, API_SECRET);
    NexmoClient client = new NexmoClient (auth);
    TextMessage message = new TextMessage (FROM_NUMBER, TO_NUMBER, "Hello from Nexmo!");
    SmsSubmissionResult [] responses = client.getSmsClient ().submitMessage (message);
    for (SmsSubmissionResult response : responses) {
        System.out.println (response);
    }
}


 public static void main (String [] args) throws Exception {AuthMethod auth = AuthMethodFactory.createTokenAuthMethod(API_KEY, API_SECRET);
    NexusClient client = new NexusClient (auth);
    TextMessage message = new TextMessage (FROM_NUMBER, TO_NUMBER, "Hi from Nexmo!");
    SmsSubmissionResult [] responses = client.getSmsClient ().submitMessage (message);
    for (SmsSubmissionResult resp : responses) {
        System.out.println ("Message successfully processed: " + resp);
    }
}


