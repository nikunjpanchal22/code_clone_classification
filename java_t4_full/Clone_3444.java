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
    java.util.Scanner scanner = new java.util.Scanner(System.in);
    String choice;
    do {
        System.out.println("What is your choice? (x/o)");
        choice = scanner.nextLine().toLowerCase();
    } while (!(choice.equals("x") || choice.equals("o")));
    return choice.charAt(0);
}


