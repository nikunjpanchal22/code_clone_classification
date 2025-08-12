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
   log ("Generating 6 random integers in range 0..55.");
    int START = 0;
    int END = 55;
    Random randomGenerator = new Random ();
    for (int idx = 1;
    idx <= 6; ++ idx) {
        showRandomInteger (START, END, randomGenerator);
    }
    log ("Done");
}
