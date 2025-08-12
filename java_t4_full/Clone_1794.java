public static void main (String [] args) {
    String x = "gdfg";
    System.out.println ("x length: " + x.length ());
    String [] lines = Split (x, 30, 210);
    for (int i = 0;
    i < lines.length; i ++) {
        System.out.println ("lines[" + i + "]: (len: " + lines [i].length () + ") : " + lines [i]);
    }
}


 public static void main (String [] args){ 
    String x = "gdfg"; 
    int lengthX = x.length(); 
    System.out.println("x length: " +lengthX); 
    String [] output = Split(x, 30, 210); 
    System.out.println(); 
    for (int i = 0; i < output.length; i++) { 
        int lenX = output[i].length(); 
        System.out.println("lines[" + i +"]: (len: " + lenX +") :" + output[i]); 
    } 
} 


