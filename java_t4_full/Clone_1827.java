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
    int solutions = (int) dataStructure.values().stream()
            .mapToInt(list -> list.size())
            .reduce(1, (x, y) -> x * y);
    String[][] allCombinations = new String[solutions + 1][];
    allCombinations[0] = dataStructure.keySet().toArray(new String[n]);
    List<Integer> indices = new ArrayList<>();
    int offset = 0;
    for (Vector<String> vec : dataStructure.values()) {
        indices.add(0);
        while (indices.get(offset) < vec.size()) {
            String[] combination = new String[n];
            int i = 0;
            for (Vector<String> v : dataStructure.values()) {
                combination[i] = v.get(indices.get(i));
                i++;
            }
            allCombinations[offset + 1] = combination;
            offset++;
            indices.set(offset - 1, indices.get(offset - 1) + 1);
        }
    }
    return allCombinations;
}


