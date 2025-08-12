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
    String s;
    BufferedReader br = new BufferedReader (new InputStreamReader (System.in));
    System.out.println ("Enter the Statement:");
    s = br.readLine ();
    int numOfChar = 0, txtLen = 0;
    do {
        try {
            char[] txtArray = s.toCharArray ();
            txtLen = txtArray.length;
            numOfChar = 0;
            for (int i = 0;
            i < txtLen; i ++) {
                if ((txtArray [0] == txtArray [i]) && ((txtArray [0] >= 'A' && txtArray [0] <= 'Z') || (txtArray [0] >= 'a' && txtArray [0] <= 'z'))) numOfChar ++;
            }
            if (numOfChar != 0) System.out.println (txtArray [0] + " " + numOfChar + " Times");
            s = s.replace ("" + txtArray [0], "");
        } catch (Exception ex) {
        }
    } while (txtLen != 1);
}
