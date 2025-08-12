public static void main (String args []) {
    int ci, i, j, k, l = 0;
    String str, str1, result, subString;
    char c1, c2, ch;
    Scanner scan = new Scanner (System.in);
    System.out.print ("Enter a String : ");
    str = scan.nextLine ();
    i = str.length ();
    for (c1 = 'A'; c1 <= 'z'; c1 ++) {
        for (c2 = 'A'; c2 <= 'z'; c2 ++) {
            result = new String (new char [] {c1, c2});
            k = 0;
            for (j = 0; j < i - 1; j ++) {
                subString = str.substring (j, j + 2);
                if (result.equals (subString)) {
                    k ++;
                }
            }
            if (k > 0) {
                System.out.println ("" + result + ": " + k);
            }
        }
    }
}




public static void main(String args[]) throws IOException {
    int len, count;
    char c1, c2;
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    System.out.print("Enter a String : ");
    String str = br.readLine();
    len = str.length();
    for (c1 = 'A'; c1 <= 'z'; c1++) {
        for (c2 = 'A'; c2 <= 'z'; c2++) {
            String pair = new String(new char[]{c1, c2});
            count = 0;
            for (int j = 0; j < len - 1; j++) {
                String substr = str.substring(j, j + 2);
                if (pair.equals(substr)) {
                    count++;
                }
            }
            if (count > 0) {
                System.out.println(pair + ": " + count);
            }
        }
    }
}


