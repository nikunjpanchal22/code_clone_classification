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


//3.
public static void main (String...a) { 
    System.out.print ("Please enter a string: "); 
    Scanner keyboard = new Scanner (System.in); 
    String sentence = keyboard.nextLine (); 
    int[] array = new int [256]; 
  
    // Create an array with 256 elements 
    // to keep track of how many times a character appears 
    for (int i = 0; i < sentence.length (); i++) { 
        array[sentence.charAt (i)] ++; 
    } 
  
    // Iterate over array and print out each character 
    // and its corresponding frequency 
    for (int i = 0; i < 256; i++) { 
        char character = (char)i; 
        if (array[i] > 0) { 
            if (array[i] == 1) { 
                System.out.print (character); 
            } else { 
                System.out.print (character + "" + array[i]); 
            } 
        } 
    } 
  
} 
