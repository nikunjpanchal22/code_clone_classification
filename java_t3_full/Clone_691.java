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


// 4.
public static void main(String... a) 
{ 
    System.out.println("Enter your string: ");
    Scanner scan = new Scanner(System.in);
    String str = scan.nextLine();
    int[] arr = new int[256];
  
    // Counts the number of characters 
    // present in the given string 
    for (int i = 0; i < str.length(); i++) 
    { 
        arr[str.charAt(i)]++; 
    } 
  
    // Print the characters and their 
    // corresponding frequencies 
    for (int i = 0; i < 256; i++) 
    { 
        char character = (char)i; 
        if (arr[i] > 0) 
        { 
            if (arr[i] == 1) 
            System.out.print(character); 
            else
            System.out.print(character + "" + arr[i]); 
        } 
    } 
}


