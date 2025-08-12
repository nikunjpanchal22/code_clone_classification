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
    Vector<Integer> indices = new Vector<>();
    for (Vector<String> vector : dataStructure.values()) {
        indices.add(0);
    }
    int index = 0;
    while (index != solutions) {
        Vector<String> combination = new Vector<String>(n);
        int j = 0;
        for (Vector<String> vec : dataStructure.values()) {
            combination.add(vec.get(indices.get(j)));
            if (++indices.get(j).intValue() == vec.size()) {
                indices.set(j, 0);
            }
            j++;
        }
        allCombinations[index + 1] = combination.toArray(new String[n]);
        index++;
    }
    return allCombinations;
}


