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
    for (int i = 0; i < N; i++)
        arr[i] = i;
    Random rand = new Random();
    int r_index, r_value;
    for (int i = 0; i < N; i++) {
        r_index = rand.nextInt(N);
        r_value = arr[r_index];
        arr[r_index] = arr[i];
        arr[i] = r_value;
    }
}


