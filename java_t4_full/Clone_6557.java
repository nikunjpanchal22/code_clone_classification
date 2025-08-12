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
    for (int i = 0; i < 20; i++)
    {
        int temp;
        do {
            temp = new Random().nextInt(100) + 1;
        } while (IntStream.of(array).anyMatch(x -> x == temp));
        array[i] = temp;
    }
}


