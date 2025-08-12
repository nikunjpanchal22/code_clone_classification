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
    AuthMethod authM = new TokenAuthMethod("API_KEY", "API_SECRET");
    NexmoClient nClient = new NexmoClient(authM);
    TextMessage textMsg = new TextMessage("FROM_NUMBER", "TO_NUMBER", "Hello, Nexmo sends greetings!");
    Stream.of(nClient.getSmsClient().submitMessage(textMsg)).forEach(System.out::println);
}


