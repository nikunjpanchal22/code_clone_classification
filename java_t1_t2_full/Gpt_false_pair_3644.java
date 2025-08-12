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


char wf2 () {
Scanner input = new Scanner(System.in);
    System.out.println ("What is your choice? (1/2)");
    if (input.findInLine (".") != null) {
        choice = input.findInLine (".").charAt (0);
        while (choice != '1' && choice != '2') {
            System.out.println ("You must enter 1 or 2!");
            choice = input.findInLine (".").charAt (0);
        }
    }
    return choice;
}
