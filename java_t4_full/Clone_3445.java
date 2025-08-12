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
    java.util.Scanner sc = new java.util.Scanner(System.in);
    char ch;
    while (true) {
        System.out.println("What is your choice? (x/o)");
        ch = sc.next().charAt(0);
        if (ch=='x' || ch=='o') break;
    } 
    return ch;
}


