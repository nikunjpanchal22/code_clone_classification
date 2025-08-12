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




public static final void main(String...aArgs) {
    log("Generating 10 random integers in range 1..10.");
    int START = 1, END = 10;
    Random randomGenerator = new Random();
    Stream.generate(() -> showRandomInteger(START, END, randomGenerator)).limit(10).toArray();
    log("Done");
}


