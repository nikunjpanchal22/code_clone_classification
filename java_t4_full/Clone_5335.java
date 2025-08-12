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
    int[] values = new int[N];
    for (int i = 0; i < N; i++)
        values[i]=i;
    Random rand = new Random();
    int rIdx, rVal;
    for (int i = 0; i < N; i++) {
        rIdx = rand.nextInt(N);
        rVal = values[rIdx];
        values[rIdx] = values[i];
        values[i] = rVal;
    }
}


