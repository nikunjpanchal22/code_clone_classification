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
    String input;
    System.out.println ("What is your choice? (x/o)");
    input = System.console().readLine();
    if(input.length() > 0) {
        char choice = Character.toLowerCase(input.charAt(0));
        while (choice != 'x' && choice != 'o') {
            System.out.println ("You must enter x or o!");
            input = System.console().readLine();
            if(input.length() > 0) {
                choice = Character.toLowerCase(input.charAt(0));
            }
        }
        return choice;
    }
    return ' ';
}


