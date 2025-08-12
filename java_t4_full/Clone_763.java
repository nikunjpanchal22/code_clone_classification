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


 public static void shuffleArray (int [] array) {
    Random rand = new Random ();
    for (int i = 0;
    i < array.length; i ++) {
        int randomChoose =  i + rand.nextInt(array.length - i);
        int temp = array[randomChoose];
        array[randomChoose] = array[i];
        array[i] = temp;
    }
}


