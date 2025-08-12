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
    Scanner scan = new Scanner (System.in);
    System.out.println ("What is your choice? (x/o)");
    char choice = scan.next().charAt(0);
    
    switch(choice) {
        case 'x': {
            return choice;
            break;
        }
        case 'o': {
            return choice;
            break;
        }
        default: {
            while (choice != 'x' && choice != 'o') {
                System.out.println ("You must enter x or o!");
                choice = scan.next().charAt(0);
            }
            return choice;
            break;
        }
    }
}


