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
    Vector<Integer> vector = new Vector<>();
    while(vector.size() < 20){
        int number = new Random().nextInt(100) + 1;
        if(!vector.contains(number)){
            vector.add(number);
        }
    }
    int[] array = vector.stream().mapToInt(i->i).toArray();
}


