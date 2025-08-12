public static void main (String [] args) throws IOException {
    String ch;
    BufferedReader br = new BufferedReader (new InputStreamReader (System.in));
    System.out.print ("Enter the Statement:");
    ch = br.readLine ();
    int count = 0, len = 0;
    do {
        try {
            char name [] = ch.toCharArray ();
            len = name.length;
            count = 0;
            for (int j = 0;
            j < len; j ++) {
                if ((name [0] == name [j]) && ((name [0] >= 65 && name [0] <= 91) || (name [0] >= 97 && name [0] <= 123))) count ++;
            }
            if (count != 0) System.out.println (name [0] + " " + count + " Times");
            ch = ch.replace ("" + name [0], "");
        } catch (Exception ex) {
        }
    } while (len != 1);
}


 public static void main (String [] args) throws IOException {
    String text;
    BufferedReader br = new BufferedReader (new InputStreamReader (System.in));
    System.out.println ("Enter the Statement:");
    text = br.readLine ();
    int amount = 0, length = 0;
    do {
        try {
            char[] chArray = text.toCharArray ();
            length = chArray.length;
            amount = 0;
            for (int i = 0;
            i < length; i ++) {
                if ((chArray [0] == chArray [i]) && ((chArray [0] >= 'A' && chArray [0] <= 'Z') || (chArray [0] >= 'a' && chArray [0] <= 'z'))) amount ++;
            }
            if (amount != 0) System.out.println (chArray [0] + " " + amount + " Times");
            text = text.replace ("" + chArray [0], "");
        } catch (Exception ex) {
        }
    } while (length != 1);
}
