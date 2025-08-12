public static void duplication () {
    int max = 100;
    int min = 1;
    Random rand = new Random ();
    int index = 0;
    int [] all = new int [20];
    while (index < 20) {
        boolean duplicate = false;
        int randomNum = rand.nextInt ((max - min) + 1) + min;
        for (int i = 0;
        i < all.length; i ++) {
            if (all [i] == randomNum) {
                duplicate = true;
                break;
            }
        }
        if (! duplicate) {
            all [index ++] = randomNum;
        }
    }
}


 

public static void duplication() {
    int[] array = new int[20];
    HashSet<Integer> set = new HashSet<>();
    while (set.size() < 20) {
        set.add(new Random().nextInt(100) + 1);
    }
    Iterator<Integer> iterator = set.iterator();
    for (int i = 0; i < 20; i++) {
        array[i] = iterator.next();
    }
}


