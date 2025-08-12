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
    int[] val_array = new int[N];
    for (int iterator1 = 0; iterator1 < val_array.length; iterator1++)
        val_array[iterator1] = iterator1;
    Random rand_gen1 = new Random();
    int rand_index, rand_val;
    for (int iterator1 = 0; iterator1 < val_array.length; iterator1++) {
        rand_index = rand_gen1.nextInt(val_array.length);
        rand_val = val_array[rand_index];
        val_array[rand_index] = val_array[iterator1];
        val_array[iterator1] = rand_val;
    }
}


