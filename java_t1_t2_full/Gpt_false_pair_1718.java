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
   log ("Generating 15 random integers in range 30..40.");
    int START = 30;
    int END = 40;
    Random randomGenerator = new Random ();
    for (int idx = 1;
    idx <= 15; ++ idx) {
        showRandomInteger (START, END, randomGenerator);
    }
    log ("Done");
}
