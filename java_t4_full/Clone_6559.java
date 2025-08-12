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
    List<Integer> list = new ArrayList<>();
    while (list.size() < 20) {
        int num = new Random().nextInt(100) + 1;
        if (!list.contains(num)) {
            list.add(num);
        }
    }
    int[] array = list.stream().mapToInt(i->i).toArray();
}


