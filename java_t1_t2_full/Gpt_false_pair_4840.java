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
    String inp;
    BufferedReader buff = new BufferedReader (new InputStreamReader (System.in));
    System.out.print ("Please Enter a Statement:");
    inp = buff.readLine ();
    int c = 0, size = 0;
    do {
        try { 
            char cname [] = inp.toCharArray ();
            size = cname.length;
            c = 0;
            for (int x = 0;
            x < size; x ++) {
                if ((cname [0] == cname [x]) && ((cname [0] >= 65 && cname [0] <= 91) || (cname [0] >= 97 && cname [0] <= 123))) c ++;
            }
            if (c != 0) System.out.println (cname [0] + " " + c + " Times");
            inp = inp.replace ("" + cname [0], "");
        } catch (Exception ex) {
        }
    } while (size != 1);
}
