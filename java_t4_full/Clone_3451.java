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
    char option;
    while (true) {
        System.out.println("What is your choice? (x/o)");
        option = new java.util.Scanner(System.in).nextLine().toLowerCase().charAt(0);
        if (option == 'x' || option == 'o') return option;
    }   
}


