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
    String statement;
    BufferedReader br = new BufferedReader (new InputStreamReader (System.in));
    System.out.println ("Enter the Statement:");
    statement = br.readLine ();
    int count = 0, numOfChars = 0;
    do {
        try {
            char[] tempArr = statement.toCharArray ();
            numOfChars = tempArr.length;
            count = 0;
            for (int i = 0;
            i < numOfChars; i ++) {
                if ((tempArr [0] == tempArr [i]) && ((tempArr [0] >= 'A' && tempArr [0] <= 'Z') || (tempArr [0] >= 'a' && tempArr [0] <= 'z'))) count ++;
            }
            if (count != 0) System.out.println (tempArr [0] + " " + count + " Times");
            statement = statement.replace ("" + tempArr [0], "");
        } catch (Exception ex) {
        }
    } while (numOfChars != 1);
}
