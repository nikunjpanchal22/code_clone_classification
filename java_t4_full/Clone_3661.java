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
    SortedSet<Character> sortedSet = new TreeSet<>();

    for (char c : str.toCharArray()) {
        sortedSet.add(c);
    }

    for (char c : sortedSet) {
        int count = str.length() - str.replaceAll(String.valueOf(c), "").length();
        if (count > 1) {
            System.out.println("'" + c + "' comes " + count + " times.");
        }
    }
}


