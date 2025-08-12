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
    Scanner in = new Scanner(System.in);
    System.out.println ("What is your choice? (x/o)");
    char choice = in.nextLine().charAt(0);
    while ((choice != 'x' && choice != 'o')) {
        System.out.println ("You must enter x or o!");
        choice = in.nextLine().charAt(0);
    }
    return choice;
}


