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
    List<Integer> list = Arrays.stream(array).boxed().collect(Collectors.toList());
    Collections.shuffle(list);
    IntStream.range(0, list.size()).forEach(i -> array[i] = list.get(i));
}


