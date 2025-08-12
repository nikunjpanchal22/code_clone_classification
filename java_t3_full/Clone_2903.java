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
    int [] value = new int[N];
    for (int k = 0; k < value.length; k++) 
        value[k] = k;
    Random rand_gen = new Random();
    int r_index, r_value;
    for (int k = 0; k < value.length; k++) {
        r_index = rand_gen.nextInt(value.length);
        r_value = value[r_index];
        value[r_index] = value[k];
        value[k] = r_value;
    }
}


