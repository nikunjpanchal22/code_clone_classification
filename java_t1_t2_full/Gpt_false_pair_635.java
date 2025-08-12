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


//6. 
public static void main (String...a) { 
    System.out.println("Please enter your string:");
    Scanner s =  new Scanner (System.in); 
    String str = s.nextLine (); 
  
    int [] array = new int[256];
  
    // Used to count the frequency of characters   
    for (int i = 0;
    i < str.length (); i ++) { 
        array[str.charAt(i)]++; 
    } 
  
    // Used to print the character and  
    // its frequency only once 
    for (int i = 0;
    i < 256; i ++) { 
        char character = (char)i; 
        if (array[i] > 0) { 
            if (array[i] == 1) { 
                System.out.print(character); 
            } 
            else { 
                System.out.print(character + "" + array[i]); 
            } 
        } 
    }   
} 
