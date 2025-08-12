public static void main (String [] args) {
    int count = 0;
    String str = "hi this is is is line";
    String [] s1 = str.split (" ");
    for (int i = 0;
    i <= s1.length - 1; i ++) {
        if (s1 [i].equals ("is")) {
            count ++;
        }
    }
    System.out.println (count);
}


public static void main (String [] args) {
    int number = 0;
    String contents = "this line has several is is words";
    String [] splitup = contents.split (" ");
    for (int i = 0; 
    i <= splitup.length - 1; i ++) {
        if (splitup [i].equals ("is")) {
            number ++;
        }
    }
    System.out.println (number);
}
