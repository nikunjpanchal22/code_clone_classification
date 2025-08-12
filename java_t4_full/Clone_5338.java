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
    int[] numsArr = new int[N];
    for (int a = 0; a < numsArr.length; a++) 
        numsArr[a] = a;
    Random randomGen = new Random();
    for (int a = 0; a < numsArr.length; a++) {
        int randomIndex = randomGen.nextInt(numsArr.length);
        int temp = numsArr[randomIndex];
        numsArr[randomIndex] = numsArr[a];
        numsArr[a] = temp;
    }
}


