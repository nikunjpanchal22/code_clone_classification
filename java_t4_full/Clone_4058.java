public static void shuffle (int [] array) {
    if (random == null) random = new Random ();
    int count = array.length;
    for (int i = count;
    i > 1; i --) {
        swap (array, i - 1, random.nextInt (i));
    }
}



 

public static void shuffle(int[] array) {
    if(random == null) random = new Random();
    List<Integer> intList = Arrays.stream(array).boxed().collect(Collectors.toList());
    Collections.shuffle(intList, random);
    for (int i = 0; i < array.length; i++) {
	   array[i] = intList.get(i);
    }
}


