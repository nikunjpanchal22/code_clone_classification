public static void main (String...a) {
    System.out.print ("Enter the String");
    Scanner sc = new Scanner (System.in);
    String st = sc.nextLine ();
    int [] ar = new int [256];
    for (int i = 0;
    i < st.length (); i ++) {
        ar [st.charAt (i)] = ar [st.charAt (i)] + 1;
    }
    for (int i = 0;
    i < 256; i ++) {
        char ch = (char) i;
        if (ar [i] > 0) {
            if (ar [i] == 1) {
                System.out.print (ch);
            } else {
                System.out.print (ch + "" + ar [i]);
            }
        }
    }
}





public static void main(String... a){
    System.out.print("Enter the String: ");
    Scanner input = new Scanner(System.in);
    String userInput = input.nextLine();
    int[] charactersArray = new int[256];
    
    for (int idx = 0; idx < userInput.length(); idx++){
        charactersArray[userInput.charAt(idx)]++;
    }
    for (int idx = 0; idx < 256; idx++){
        char currChar = (char) idx;
        if(charactersArray[idx] > 0){
            System.out.print(charactersArray[idx] == 1 ? currChar : currChar + String.valueOf(charactersArray[idx]));
        }
    }
}


