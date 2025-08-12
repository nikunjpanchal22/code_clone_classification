public String [] [] allUniqueCombinations () {
    int n = dataStructure.keySet ().size ();
    int solutions = 1;
    for (Vector < String > vector : dataStructure.values ()) {
        solutions *= vector.size ();
    }
    String [] [] allCombinations = new String [solutions + 1] [];
    allCombinations [0] = dataStructure.keySet ().toArray (new String [n]);
    for (int i = 0;
    i < solutions; i ++) {
        Vector < String > combination = new Vector < String > (n);
        int j = 1;
        for (Vector < String > vec : dataStructure.values ()) {
            combination.add (vec.get ((i / j) % vec.size ()));
            j *= vec.size ();
        }
        allCombinations [i + 1] = combination.toArray (new String [n]);
    }
    return allCombinations;
}


 public String[][] allUniqueCombinations() {
    int n = dataStructure.keySet().size();
    int solutions = 1;
    for (Vector<String> vector : dataStructure.values()) {
        solutions *= vector.size();
    }
    String[][] allCombinations = new String[solutions + 1][];
    allCombinations[0] = dataStructure.keySet().toArray(new String[n]);
    int[] product = new int[dataStructure.values().size()];
    int offset = 1;
    for (Vector<String> vec : dataStructure.values()) {
        product[offset - 1] = vec.size();
        int idx = 0;
        while (idx < product[offset - 1]) {
            String[] combination = new String[n];
            int i = 0;
            for (Vector<String> v : dataStructure.values()) {
                combination[i] = v.get(idx);
                i++;
            }
            for (int j = 0; j < offset; j++) {
                allCombinations[offset + j] = append(allCombinations[offset + j], combination);
            }
            offset += offset;
            idx++;
        }
    }
    return allCombinations;
}


