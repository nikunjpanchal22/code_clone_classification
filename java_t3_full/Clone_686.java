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


// 1. 
public static void main (String...a) {
    System.out.print ("Please enter your text here!: ");
    Scanner input = new Scanner (System.in);
    String enteredString = input.nextLine ();
    int arraySize = 256;
    int letterCounts[] = new int[arraySize];

    for (int i = 0; i < enteredString.length (); i++) {
        letterCounts[enteredString.charAt(i)]++;
    }

    for (int i = 0; i < arraySize; i++) {
        char character = (char) i;
        if (letterCounts[i] > 0) {
            if (letterCounts[i] == 1) {
                System.out.print (character);
            } else {
                System.out.print (character + "" + letterCounts[i]);
            }
        }
    }
}


