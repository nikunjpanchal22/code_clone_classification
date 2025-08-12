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
    int min = 1;
    int max = 10;
    java.util.Random rand = new java.util.Random();
    for (int i = 1; i <= 10; i++) {
        showRandomInteger (min, max, rand);
    }
    log ("Done");
}


