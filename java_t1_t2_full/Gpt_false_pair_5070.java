public int compare (String s1, String s2) {
    String [] s1NameNumPair = s1.split (" ");
    String [] s2NameNumPair = s2.split (" ");
    int diff = s1NameNumPair [0].compareTo (s2NameNumPair [0]);
    if (0 == diff) {
        Double n1 = Double.parseDouble (s1NameNumPair [1]);
        Double n2 = Double.parseDouble (s2NameNumPair [1]);
        return n1.compareTo (n2);
    }
    return diff;
}


public int compareStrings (String a1, String a2) {
    String [] a1NameNumPair = a1.split (" ");
    String [] a2NameNumPair = a2.split (" ");
    int divergence = a1NameNumPair [0].compareTo (a2NameNumPair [0]);
    if (0 == divergence) {
        Double no1 = Double.parseDouble (a1NameNumPair [1]);
        Double no2 = Double.parseDouble (a2NameNumPair [1]);
        return no1.compareTo (no2);
    }
    return divergence;
}
