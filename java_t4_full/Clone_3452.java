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
    System.out.println("What is your choice? (x/o)");
    String str = new java.util.Scanner(System.in).nextLine();
    char choice = str.charAt(0);
    return (choice == 'x' || choice == 'o') ? choice : wf();
}


