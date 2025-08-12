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
    int[] counters = new int[128];
    for (char c : str.toCharArray()) {
        counters[c]++;
    }
    for (int i = 0; i < counters.length; i++) {
        if (counters[i] > 1) {
            System.out.println("'" + (char) i + "' comes " + counters[i] + " times.");
        }
    }
}


