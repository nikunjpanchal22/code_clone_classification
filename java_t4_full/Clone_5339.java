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
    int [] data = new int[N];
    for (int idx = 0; idx < data.length; ++ idx)
        data[idx] = idx;
    Random rng = new Random();
    for (int idx = 0; idx < data.length; ++ idx) {
        int randomPos = rng.nextInt(data.length);
        int swapValue = data[randomPos];
        data[randomPos] = data[idx];
        data[idx] = swapValue;
    }
}


