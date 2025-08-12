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
    BufferedReader bf = new BufferedReader (new InputStreamReader (System.in));
    System.out.print ("Please Enter a Statement:");
    str = bf.readLine ();
    int count = 0, length;
    do {
        try { 
            char word [] = str.toCharArray ();
            length = word.length;
            count = 0;
            for (int i = 0;
            i < length; i ++) {
                if ((word [0] == word [i]) && ((word [0] >= 65 && word [0] <= 91) || (word [0] >= 97 && word [0] <= 123))) count ++;
            }
            if (count != 0) System.out.println (word [0] + " " + count + " times");
            str = str.replace ("" + word [0], "");
        } catch (Exception ex) {
        }
    } while (length != 1);
}
