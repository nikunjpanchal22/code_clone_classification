public static boolean contains (String a, String b) {
    int diff = a.length () - b.length ();
    while (a.length () > 0) {
        b = b.replace (a.substring (0, 1), "");
        a = a.replace (a.substring (0, 1), "");
        if (diff != a.length () - b.length ()) return false;
    }
    return true;
}


 public static boolean contains(String a, String b) {
    int aSize = a.length();
    int bSize = b.length();

    if (aSize != bSize){
        return false;
    }
    char[] charA = a.toCharArray();
    char[] charB = b.toCharArray();

    int[] asciiA = new int[256];
    int[] asciiB = new int[256];


    for (int i = 0; i < charA.length; i++){
        int val = charA[i];
        asciiA[val]++;
    }

    for (int i = 0; i < charB.length; i++){
        int val = charB[i];
        asciiB[val]++;
    }

    for (int i = 0; i < charA.length; i++){
        if (asciiA[i] != asciiB[i]){
            return false;
        }
    }
    return true;
}


