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
    int[] numbers = new int[N];
    for (int counter = 0; counter < N; counter++)
        numbers[counter] = counter;
    Random rand = new Random();
    int r_index, r_value;
    for (int counter = 0; counter < N; counter++) {
        r_index = rand.nextInt(N);
        r_value = numbers[r_index];
        numbers[r_index] = numbers[counter];
        numbers[counter] = r_value;
    }
}


