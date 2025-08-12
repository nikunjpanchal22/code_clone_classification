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


// 10. 
public static void main(String... a) 
{ 
    System.out.println("Input one sentence: ");
    Scanner scan = new Scanner (System.in);
    String str = scan.nextLine(); 
    int array[] = new int[256]; 
  
    // Counts characters that are input 
    for(int i = 0; i < str.length(); i++) 
    { 
        array[str.charAt(i)]++; 
    } 
  
    // Iterate over the array to print each character
    // and its corresponding frequency
    for (int i = 0; i < 256; i++)
    { 
        char ch = (char)i; 
        if (array[i] > 0)
        { 
            if (array[i] == 1) 
            System.out.print(ch); 
            else
            System.out.print(ch + "" + array[i]); 
        } 
    } 
}


