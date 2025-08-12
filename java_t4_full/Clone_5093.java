public static void main (String [] args) throws Exception {
    AuthMethod auth = new TokenAuthMethod (API_KEY, API_SECRET);
    NexmoClient client = new NexmoClient (auth);
    TextMessage message = new TextMessage (FROM_NUMBER, TO_NUMBER, "Hello from Nexmo!");
    SmsSubmissionResult [] responses = client.getSmsClient ().submitMessage (message);
    for (SmsSubmissionResult response : responses) {
        System.out.println (response);
    }
}





public static void main (String[] args) throws Exception {
    NexmoClient client = new NexmoClient(new TokenAuthMethod(API_KEY, API_SECRET));
    SmsSubmissionResult[] responses = client.getSmsClient().submitMessage(new TextMessage(FROM_NUMBER, TO_NUMBER, "Hello from Nexmo!"));
    Arrays.asList(responses).forEach(response -> System.out.println(response));
}


