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
    String expression;
    BufferedReader br = new BufferedReader (new InputStreamReader (System.in));
    System.out.println ("Enter the Statement:");
    expression = br.readLine ();
    int charCount = 0, charNumber = 0;
    do {
        try {
            char[] array = expression.toCharArray ();
            charNumber = array.length;
            charCount = 0;
            for (int i = 0;
            i < charNumber; i ++) {
                if ((array [0] == array [i]) && ((array [0] >= 'A' && array [0] <= 'Z') || (array [0] >= 'a' && array [0] <= 'z'))) charCount ++;
            }
            if (charCount != 0) System.out.println (array [0] + " " + charCount + " Times");
            expression = expression.replace ("" + array [0], "");
        } catch (Exception ex) {
        }
    } while (charNumber != 1);
}
