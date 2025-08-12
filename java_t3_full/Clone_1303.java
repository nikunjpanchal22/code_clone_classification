public static final void main (String...aArgs) {
    log ("Generating 10 random integers in range 1..10.");
    int START = 1;
    int END = 10;
    Random randomGenerator = new Random ();
    for (int idx = 1;
    idx <= 10; ++ idx) {
        showRandomInteger (START, END, randomGenerator);
    }
    log ("Done");
}


public static final void main (String...aArgs) {
    log ("Generating 10 random integers in range 1..10.");
    int START = 1;
    int END = 10;
    secureRandom randomGenerator = new secureRandom ();
    byte[] randomBytes = new byte[20];
    randomGenerator.nextBytes( randomBytes );
    for (int i = 0; i < 10; i++ ) {
        int randomInt = ( randomBytes[i] % (END - START + 1) ) + START;
        log ("Generated : " + randomInt );
    }
    log ("Done");
}


