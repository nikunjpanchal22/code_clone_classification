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
    log ("Generating 25 random integers in range 40..50.");
    int START = 40;
    int END = 50;
    Random randomGenerator = new Random ();
    for (int idx = 1;
    idx <= 25; ++ idx) {
        showRandomInteger (START, END, randomGenerator);
    }
    log ("Done");
}
