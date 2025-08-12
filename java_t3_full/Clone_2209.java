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
    int count = 0;
    String str = "hi this is is is line";
    int idx = str.indexOf("is");
    while (idx != -1) {
        count++;
        idx = str.indexOf("is", idx + 1);
    } 
    System.out.println (count);
}


