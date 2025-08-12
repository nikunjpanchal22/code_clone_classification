public static void shuffleArray (int [] array) {
    List < Integer > list = new ArrayList < > ();
    for (int i : array) {
        list.add (i);
    }
    Collections.shuffle (list);
    for (int i = 0;
    i < list.size (); i ++) {
        array [i] = list.get (i);
    }
}


 

public static void shuffleArray(int[] array) {
    List<Integer> shuffleList = Arrays.stream(array)
            .boxed()
            .collect(Collectors.toList());
    Collections.shuffle(shuffleList);
    IntStream.range(0, shuffleList.size())
            .forEach(i -> array[i] = shuffleList.get(i));
}


