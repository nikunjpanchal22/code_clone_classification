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
    try {
        File json = new File ("test.json");
        Tweet [] tweets = new ObjectMapper().readValue (json, Tweet [].class);
        List<Tweet> tweetList = Arrays.asList(tweets);
        for(Tweet tweet: tweetList)
            System.out.println (tweet);
    } catch (IOException ex) {
        ex.printStackTrace ();
    }
}


