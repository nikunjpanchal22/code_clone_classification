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


char wf3 () {
Scanner input = new Scanner(System.in);
    System.out.println ("What is your choice? (yes/no)");
    if (input.findInLine (".") != null) {
        choice = input.findInLine (".").charAt (0);
        while (choice != 'yes' && choice != 'no') {
            System.out.println ("You must enter yes or no!");
            choice = input.findInLine (".").charAt (0);
        }
    }
    return choice;
}
