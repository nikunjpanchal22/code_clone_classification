public static void main (String [] args) {
    int [] nums = new int [N];
    for (int i = 0;
    i < nums.length; ++ i) {
        nums [i] = i;
    }
    Random randomGenerator = new Random ();
    int randomIndex;
    int randomValue;
    for (int i = 0;
    i < nums.length; ++ i) {
        randomIndex = randomGenerator.nextInt (nums.length);
        randomValue = nums [randomIndex];
        nums [randomIndex] = nums [i];
        nums [i] = randomValue;
    }
}





public static void main(String[] args) {
    int[] arr = new int[N];
    for (int index = 0; index < arr.length; index++)
        arr[index] = index;
    Random rnd = new Random();
    int randIdx, randVal;
    for (int index = 0; index < arr.length; index++) {
        randIdx = rnd.nextInt(arr.length);
        randVal = arr[randIdx];
        arr[randIdx] = arr[index];
        arr[index] = randVal;
    }
}


