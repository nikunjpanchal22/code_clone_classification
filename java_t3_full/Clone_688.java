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


//8. 
public static void main (String[] args) { 
    System.out.println("Input string :");
    Scanner sc = new Scanner(System.in); 
    String inStr = sc.nextLine();
    int [] alphaCounter = new int[256]; 
  
    for (int i = 0; i < inStr.length(); i++) { 
        alphaCounter[inStr.charAt(i)]++; 
    } 
  
    for (int i = 0; i < 256; i++) { 
        char ch = (char)i; 
        if (alphaCounter[i] > 0) { 
            if (alphaCounter[i] == 1)  
            System.out.print(ch); 
            else
            System.out.print(ch + "" + alphaCounter[i]); 
        } 
    } 
} 


