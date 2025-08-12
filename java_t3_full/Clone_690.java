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


// 5. 
public static void main (String...a) { 
    System.out.print ("Please enter a string: ");
    Scanner scan = new Scanner (System.in); 
    String inpStr = scan.nextLine (); 
    int [] countArr = new int [256]; 
  
    // Creating an array of 256 to keep track of each character frequency 
    for (int i = 0; i < inpStr.length (); i++) 
    { 
        countArr[inpStr.charAt(i)]++; 
    } 
  
    // Iterate over the array to print each character 
    // and its corresponding frequency 
    for (int i = 0; i < 256; i++) 
    { 
        char outputChar = (char)i; 
        if (countArr[i] > 0) 
        { 
            if (countArr[i] == 1) 
            System.out.print(outputChar); 
            else
            System.out.print(outputChar + "" + countArr[i]); 
        } 
    } 
} 


