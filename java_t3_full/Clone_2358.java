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
    try {
        File json = new File ("test.json");
        Tweet [] tweets = mapper.readValue (json, Tweet [].class);
        for(Tweet tweet: tweets)
            System.out.println (tweet);
    } catch (IOException ex) {
        ex.printStackTrace ();
    }
}


