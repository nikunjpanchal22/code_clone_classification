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



public static void main(String[] args) {
    int count = 0;
    String givenString = "hi there it is is";
    count = (givenString.length() - givenString.replace("is", "").length()) / "is".length();
    System.out.println(count);
}


