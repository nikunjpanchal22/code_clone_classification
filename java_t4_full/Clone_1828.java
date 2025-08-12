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
    int solutions = (int) dataStructure.values().stream().mapToInt(list -> list.size()).reduce(1, (x, y) -> x * y);
    String[][] allCombinations = new String[solutions + 1][];
    allCombinations[0] = dataStructure.keySet().toArray(new String[n]);
    int[] indices = new int[dataStructure.values().size()];
    for (int i = 0; i < solutions; i++) {
        String[] combination = new String[n];
        int j = 0;
        for (Vector<String> vec : dataStructure.values()) {
            combination[j] = vec.get(indices[j]);
            if (++indices[j] == vec.size()) {
                indices[j] = 0;
            }
            j++;
        }
        allCombinations[i + 1] = combination;
    }
    return allCombinations;
}


