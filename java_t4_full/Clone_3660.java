public static void main (String [] args) {
    String str = "abcdabghplhhnfl".toLowerCase ();
    Integer [] ar = new Integer [26];
    for (int i = 0;
    i < str.length (); i ++) {
        int j = str.charAt (i) - 'a';
        if (ar [j] == null) {
            ar [j] = 1;
        } else {
            ar [j] += 1;
        }
    }
    for (int i = 0;
    i < ar.length; i ++) {
        if (ar [i] != null && ar [i] > 1) {
            char c = (char) (97 + i);
            System.out.println ("'" + c + "' comes " + ar [i] + " times.");
        }
    }
}





public static void main(String[] args) {
    String str = "abcdabghplhhnfl".toLowerCase();
    char[] chars = str.toCharArray();
    Arrays.sort(chars);
    int count = 1;
    for (int i = 0; i < chars.length - 1; i++) {
        if (chars[i] == chars[i + 1]) {
            count++;
        } else {
            if (count > 1) {
                System.out.println("'" + chars[i] + "' comes " + count + " times.");
            }
            count = 1;
        }
    }
}


