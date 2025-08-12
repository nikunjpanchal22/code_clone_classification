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
    int lenX = x.length();
    System.out.println("x length: " + lenX);
    System.out.println();
    String [] LinArr = Split(x, 30, 210);
    for(int i=0; i<LinArr.length; i++){
        int lenLin = LinArr[i].length();
        System.out.println("lines[" + i + "]: (len: " + lenLin + ") : " + LinArr[i]);
    }
}


