public static void main (String [] args) throws Exception {
    AuthMethod auth = new TokenAuthMethod (API_KEY, API_SECRET);
    NexmoClient client = new NexmoClient (auth);
    TextMessage message = new TextMessage (FROM_NUMBER, TO_NUMBER, "Hello from Nexmo!");
    SmsSubmissionResult [] responses = client.getSmsClient ().submitMessage (message);
    for (SmsSubmissionResult response : responses) {
        System.out.println (response);
    }
}





public static void main(String[] args) throws Exception {
    AuthMethod auth = new TokenAuthMethod(API_KEY, API_SECRET);
    NexmoClient nClient = new NexmoClient(auth);
    TextMessage tMsg = new TextMessage(FROM_NUMBER, TO_NUMBER, "Hola from Nexmo");
    Arrays.stream(nClient.getSmsClient().submitMessage(tMsg)).forEach(result -> System.out.println(result));
}


