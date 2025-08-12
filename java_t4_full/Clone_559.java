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
    System.out.println ("What is your choice? (x/o)");
    String userInput = JOptionPane.showInputDialog("What is your choice? (x/o)");
    if(userInput.length() > 0) {
        char choice = Character.toLowerCase(userInput.charAt(0));
        while (choice != 'x' && choice != 'o') {
            System.out.println ("You must enter x or o!");
            userInput = JOptionPane.showInputDialog("What is your choice? (x/o)");
            if(userInput.length() > 0) {
                choice = Character.toLowerCase(userInput.charAt(0));
            }
        }
        return choice;
    }
    return ' ';
}


