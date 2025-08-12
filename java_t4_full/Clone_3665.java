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
    str.chars()
            .mapToObj(i -> (char) i)
            .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
            .forEach((character, count) -> {
                if (count > 1)
                    System.out.println("'" + character + "' comes " + count + " times.");
            });
}


