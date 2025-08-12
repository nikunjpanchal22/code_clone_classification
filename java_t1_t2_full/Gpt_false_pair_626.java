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
    String str;
    BufferedReader br = new BufferedReader (new InputStreamReader (System.in));
    System.out.println ("Enter the Statement:");
    str = br.readLine ();
    int num = 0, charNum = 0;
    do {
        try {
            char[] arr = str.toCharArray ();
            charNum = arr.length;
            num = 0;
            for (int i = 0;
            i < charNum; i ++) {
                if ((arr [0] == arr [i]) && ((arr [0] >= 'A' && arr [0] <= 'Z') || (arr [0] >= 'a' && arr [0] <= 'z'))) num ++;
            }
            if (num != 0) System.out.println (arr [0] + " " + num + " Times");
            str = str.replace ("" + arr [0], "");
        } catch (Exception ex) {
        }
    } while (charNum != 1);
}
