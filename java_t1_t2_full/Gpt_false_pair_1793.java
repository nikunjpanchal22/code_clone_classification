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


 public static void main (String [] args) { 
    String str = "AAABBBBCC"; 
    int length = str.length(); 
    StringBuilder sb = new StringBuilder(); 
    int count=1;
    
     for (int i = 0; i < length; i++) {
         if (i == length - 1) {
  
            sb.append(str.charAt(i).toString() + count);
            break;
        }
        if (str.charAt(i) == str.charAt(i + 1)) { 
            count++;
        } 
        else { 
            sb.append(str.charAt(i).toString() + count);
            count = 1; 
         } 
    } 
    System.out.println(sb.toString());
}
