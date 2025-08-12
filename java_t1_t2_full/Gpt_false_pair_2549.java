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
    int max = 100;
    int min = 1;
    Random rand = new Random();
    int index = 0;
    int [] all = new int [20];
    while (index < 20) {
        boolean duplication = false;
        int randomNum = rand.nextInt((max - min) + 1) + min;
        for (int i = 0; i < index; i++) {
            if (all [i] == randomNum) {
                duplication = true;
                break;
            }
        }
        if (! duplication) {
            all [index++] = randomNum;
        }
    }
}
