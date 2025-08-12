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
    int xLeng = x.length();
    System.out.println("x length: " + xLeng);
    System.out.println();
    String[] LineArr = Split(x, 30, 210);
    for(int i=0; i<LineArr.length; i++){
        int lineLeng = LineArr[i].length();
        System.out.println("lines[" + i + "]: (len: " + lineLeng + ") : " + LineArr[i]);
    }
}


