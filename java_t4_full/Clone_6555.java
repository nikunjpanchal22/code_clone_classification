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
    int count = 0;
    HashSet<Integer> set = new HashSet<>();
    Random random = new Random();
    while (count < 20) {
        int num = random.nextInt(100) + 1;
        if (!set.contains(num)) {
            set.add(num);
            array[count++] = num;
        }
    }
}


