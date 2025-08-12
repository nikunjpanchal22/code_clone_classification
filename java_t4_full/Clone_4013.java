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
    List<Integer> numbersList = IntStream.of(array).boxed().collect(Collectors.toList());
    Collections.shuffle(numbersList);
    for (int i = 0; i < array.length; i++) {
        array[i] = numbersList.get(i);
    }
}


