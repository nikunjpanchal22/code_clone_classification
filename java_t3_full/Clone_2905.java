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
    int[] number = new int[N];
    for (int iterator = 0; iterator < number.length; iterator++)
        number[iterator] = iterator;
    Random randGenerator = new Random();
    int randIdx, randVal;
    for (int iterator = 0; iterator < number.length; iterator++) {
        randIdx = randGenerator.nextInt(number.length);
        randVal = number[randIdx];
        number[randIdx] = number[iterator];
        number[iterator] = randVal;
    }
}


