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
    List<Integer> intList = Arrays.stream(array)
            .boxed()
            .collect(Collectors.toList());
    Collections.shuffle(intList);
    for (int i = 0; i < array.length; i++) {
        array[i] = intList.get(i);
    }
}


