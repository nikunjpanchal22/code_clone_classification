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


public static void duplication () {
    int maximum = 100;
    int minimum = 1;
    Random random = new Random ();
    int count = 0;
    int [] all = new int [20];
    while (count < 20) {
        boolean hasDuplicate = false;
        int randomNumber = random.nextInt ((maximum - minimum) + 1) + minimum;
        for (int i = 0;
        i < all.length; i ++) {
            if (all [i] == randomNumber) {
                hasDuplicate = true;
                break;
            }
        }
        if (! hasDuplicate) {
            all [count ++] = randomNumber;
        }
    }
}
