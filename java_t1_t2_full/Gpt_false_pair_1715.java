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
    log ("Generating 20 random integers in range 25..75.");
    int START = 25;
    int END = 75;
    Random randomGenerator = new Random ();
    for (int idx = 1;
    idx <= 20; ++ idx) {
        showRandomInteger (START, END, randomGenerator);
    }
    log ("Done");
}
