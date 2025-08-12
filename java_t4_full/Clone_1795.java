public static void main (String [] args) {
    String x = "gdfg";
    System.out.println ("x length: " + x.length ());
    String [] lines = Split (x, 30, 210);
    for (int i = 0;
    i < lines.length; i ++) {
        System.out.println ("lines[" + i + "]: (len: " + lines [i].length () + ") : " + lines [i]);
    }
}


 public static void main(String [] args){
    String x = "gdfg";
    int xLen = x.length();
    System.out.println("x length: " + xLen);
    System.out.println();
    String [] letters = Split(x, 30, 210);
    for(int i=0; i<letters.length; i++){
        int lineLen = letters[i].length();
        System.out.println("lines[" + i + "]: (len: " + lineLen + ") : " + letters[i]);
    }
}


