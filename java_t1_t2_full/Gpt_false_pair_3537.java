public static void main (String...args) throws Exception {
    List < char [] > myArray = new ArrayList < char [] > ();
    myArray.add ("string1".toCharArray ());
    myArray.add ("string2".toCharArray ());
    myArray.add ("string3".toCharArray ());
    char [] [] charArray2D = myArray.toArray (new char [0] [0]);
    System.out.println (charArray2D.length);
    StringBuilder s = new StringBuilder ();
    for (char [] c : myArray) {
        s.append (String.copyValueOf (c));
    }
    char [] charArray1D = s.toString ().toCharArray ();
    System.out.println (charArray1D.length);
}


public static void myMethod(String...args) throws Exception {
    ArrayList<char[]> myList = new ArrayList<char[]>();
    myList.add("string1".toCharArray());
    myList.add("string2".toCharArray());
    myList.add("string3".toCharArray());
    char[][] charArray2D = myList.toArray(new char[myList.size()][]);
    System.out.println(charArray2D.length);
    StringBuilder sb = new StringBuilder();
    for (char[] c : myList){
        sb.append(String.copyValueOf(c));
    }
    char[] finalArray = sb.toString().toCharArray();
    System.out.println(finalArray.length);
}
