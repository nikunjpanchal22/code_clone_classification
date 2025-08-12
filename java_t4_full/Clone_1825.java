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
    int solutions = (int) Math.pow(dataStructure.values().stream().mapToDouble(list -> list.size()).reduce(1, (x, y) -> x * y));
    String[][] allCombinations = new String[solutions + 1][];
    allCombinations[0] = dataStructure.keySet().toArray(new String[n]);
    String[] combination;
    int offset = 1;
    for (Vector<String> vec : dataStructure.values()) {
        int index = 0;
        combination = new String[vec.size()];
        while (index < combination.length) {
            combination[index] = vec.get(index);
            if (index != 0) {
                System.arraycopy(allCombinations, 0, allCombinations, offset * vec.size(), index * vec.size());
            }
            for (int i = 0; i < vec.size(); i++) {
                for (int j = 0; j < index; j++) {
                    allCombinations[offset + j] = append(allCombinations[offset + j], combination[i]);
                }
            }
            offset += index;
            index++;
        }
    }
    return allCombinations;
}


