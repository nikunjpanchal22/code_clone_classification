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
    Scanner sc = new Scanner(System.in);
    System.out.println ("What is your choice? (x/o)");
    char c = sc.next().charAt(0);
    while (!(c == 'x' || c == 'o')) {
        System.out.println ("You must enter x or o!");
        c = sc.next().charAt(0);
    }
    return c;
}


