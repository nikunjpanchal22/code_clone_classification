char wf () {
    Scanner input = new Scanner (System.in);
    System.out.println ("What is your choice? (x/o)");
    if (input.findInLine (".") != null) {
        choice = input.findInLine (".").charAt (0);
        while (choice != 'x' && choice != 'o') {
            System.out.println ("You must enter x or o!");
            choice = input.findInLine (".").charAt (0);
        }
    }
    return choice;
}


  char wf () {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    System.out.println ("What is your choice? (x/o)");
    try {
        char choice = (char)br.read();
        while (choice != 'x' && choice != 'o') {
            System.out.println ("You must enter x or o!");
            choice = (char)br.read();
        }
        return choice;
    } catch (IOException e) {
        System.out.println("Error!");
        return ' ';
    }
}


