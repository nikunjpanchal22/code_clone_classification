public static void main (String [] args) {
    String str = "AAABBBBCC";
    int length = str.length ();
    StringBuilder sb = new StringBuilder ();
    int count = 1;
    for (int i = 0;
    i < length; i ++) {
        if (i == length - 1) {
            sb.append (str.charAt (i) + "" + count);
            break;
        }
        if (str.charAt (i) == str.charAt (i + 1)) {
            count ++;
        } else {
            sb.append (str.charAt (i) + "" + count);
            count = 1;
        }
    }
    System.out.println (sb.toString ());
}


 public static void main(String[] args) { 
   String str = "AAABBBBCC"; 
    int length = str.length(); 
    int i = 0;
    int count = 0;
    char currentChar;
    String result = "";
    
    
    while (i < length) {
        currentChar = str.charAt(i);
        count = 1; 
        while (i+1 < length && currentChar == str.charAt(i+1)) { 
            count++;
            i++; 
        } 
        result += currentChar + String.valueOf(count);
        i++; 
    } 
    System.out.println(result); 
}


