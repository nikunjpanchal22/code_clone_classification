public static void main (String [] args) throws Exception {
    Tweet [] tweets;
    ObjectMapper mapper = new ObjectMapper ();
    try {
        File json = new File ("test.json");
        tweets = mapper.readValue (json, Tweet [].class);
        System.out.println ("Java object created from JSON String :");
        Arrays.asList (tweets).forEach (System.out :: println);
    } catch (IOException ex) {
        ex.printStackTrace ();
    }
}






public static void main (String [] args) throws Exception {
    ObjectMapper mapper = new ObjectMapper ();
    File json = new File ("test.json");
    try {
        Tweet [] tweets = mapper.readValue (json, Tweet [].class);
        PrintStream printStream = System.out;
        Arrays.stream(tweets).forEach(printStream::println);
    } catch (IOException ex) {
        ex.printStackTrace ();
    }
}


