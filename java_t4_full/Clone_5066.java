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




public static void main(String[] args) {
    System.out.println("Generating 10 random integers in range 1..10.");
    Random random = new Random();
    for (int i = 0; i < 10; i++) {
        System.out.println(1 + random.nextInt(10));
    }
    System.out.println("Done");
}


