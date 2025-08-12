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
    InputStreamReader reader = new InputStreamReader(System.in);
    BufferedReader bufferedReader = new BufferedReader(reader);
    System.out.println ("What is your choice? (x/o)");
    try {
        char choice = bufferedReader.readLine().charAt(0);
        while (choice != 'x' && choice != 'o') {
            System.out.println ("You must enter x or o!");
            choice = bufferedReader.readLine().charAt(0);
        }
        return choice;
    } catch (IOException ex) {
        System.out.println(ex.getMessage());
        return ' ';
    }
}


