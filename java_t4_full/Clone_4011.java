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
    Arrays.asList(array)
          .stream()
          .collect(Collectors.collectingAndThen(Collectors.toList(), collected -> {
              Collections.shuffle(collected);
              return collected.stream().mapToInt(Integer::intValue).toArray();
    }));
}


