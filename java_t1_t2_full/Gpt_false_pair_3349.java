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
    int amount = 0;
    String statement = "reading a sentence with is is phrases";
    String [] divided = statement.split (" ");
    for (int i = 0; 
    i <= divided.length - 1; i ++) {
        if (divided [i].equals ("is")) {
            amount ++;
        }
    }
    System.out.println (amount);
}
