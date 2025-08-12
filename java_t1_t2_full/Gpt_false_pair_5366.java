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


public static void main (String [] args) {
    String text = "abcdabghplhhnfl".toLowerCase ();
    Integer [] count = new Integer [26];
    for (int i = 0; i < text.length (); i ++) {
        int position = text.charAt (i) - 'a';
        if (count[position] == null) {
            count[position] = 1;
        } else {
            count[position] += 1;
        }
    }
    for (int i = 0; i < count.length; i++) {
        if (count[i] != null && count[i] > 1) {
            char letter = (char) (97 + i);
            System.out.println("'" + letter + "' comes " + count[i] + " times.");
        }
    }
}
