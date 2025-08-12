public static void main (String [] args) {
    String str = "my name is khan";
    String words [] = str.split ("\\s");
    String capitalizedWord = "";
    for (String w : words) {
        String first = w.substring (0, 1);
        String f_after = w.substring (1);
        capitalizedWord += first.toUpperCase () + f_after + " ";
    }
    System.out.println (capitalizedWord);
}


public static void main (String args[]) {
    String s = "my name is khan";
    String arr [] = s.split ("\\s");
    String w = "";
    for (String v : arr) {
        String f = v.substring (0, 1);
        String s_after = v.substring (1);
        w += f.toUpperCase () + s_after + " ";
    }
    System.out.println (w);
}
