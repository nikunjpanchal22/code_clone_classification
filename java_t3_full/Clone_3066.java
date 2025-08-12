public static int [] genRandoms (int total, int numberOfRandoms, int minimumValue) {
    int [] ret = new int [numberOfRandoms];
    Random rnd = new Random ();
    int totalLeft = total;
    for (int i = 0;
    i < numberOfRandoms; i ++) {
        final int rollsLeft = numberOfRandoms - i;
        int thisMax = totalLeft - (rollsLeft - 1) * minimumValue;
        int thisMin = Math.max (minimumValue, totalLeft / rollsLeft);
        int range = thisMax - thisMin;
        if (range < 0) throw new IllegalArgumentException ("Cannot have " + minimumValue + " * " + numberOfRandoms + " < " + total);
        int rndValue = range;
        for (int j = 0;
        j * j < rollsLeft; j ++) rndValue = rnd.nextInt (rndValue + 1);
        totalLeft -= ret [i] = rndValue + thisMin;
    }
    Collections.shuffle (Arrays.asList (ret), rnd);
    return ret;
}





public static int[] getRandomNumbers(int total, int number, int min){
    int[] nums = new int[number];
    int leftOver = total;
    Random random = new Random();
    for(int i=0; i<number; i++){
        int remainingRolls = number - i;
        int thisMax = leftOver - (remainingRolls - 1) * min;
        int thisMin = Math.max(min, leftOver/remainingRolls);
        if(thisMax - thisMin < 0) throw new IllegalArgumentException();
        int rndValue = thisMax - thisMin;
        leftOver -= nums[i] = rndValue+thisMin;
    }
    Arrays.sort(nums);
    return nums;
}


