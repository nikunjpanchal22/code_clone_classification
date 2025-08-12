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
    String sentence;
    BufferedReader br = new BufferedReader (new InputStreamReader (System.in));
    System.out.println ("Enter the Statement:");
    sentence = br.readLine ();
    int count = 0, totalCharacters = 0;
    do {
        try {
            char[] cArray = sentence.toCharArray ();
            totalCharacters = cArray.length;
            count = 0;
            for (int i = 0;
            i < totalCharacters; i ++) {
                if ((cArray [0] == cArray [i]) && ((cArray [0] >= 'A' && cArray [0] <= 'Z') || (cArray [0] >= 'a' && cArray [0] <= 'z'))) count ++;
            }
            if (count != 0) System.out.println (cArray [0] + " " + count + " Times");
            sentence = sentence.replace ("" + cArray [0], "");
        } catch (Exception ex) {
        }
    } while (totalCharacters != 1);
}
