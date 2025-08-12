public static void main (String [] args) {
    String s = "harikrishna";
    String s2 = "";
    for (int i = 0;
    i < s.length (); i ++) {
        Boolean found = false;
        for (int j = 0;
        j < s2.length (); j ++) {
            if (s.charAt (i) == s2.charAt (j)) {
                found = true;
                break;
            }
        }
        if (found == false) {
            s2 = s2.concat (String.valueOf (s.charAt (i)));
        }
    }
    System.out.println (s2);
}


 public static void main(String[] args) {
    String s = "harikrishna";
    StringBuilder sb = new StringBuilder();
    boolean found;
    for(int i=0;i<s.length();i++){
        char s_char = s.charAt(i);
        found = false;
        for(int j=0; j<sb.length();j++){
            if(s_char == sb.charAt(j)){
                found = true;
                break;
            }
        }
        if(!found){
            sb.append(s_char);
        }
    }
    System.out.println(sb.toString());
}


