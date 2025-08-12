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





public static int[] createRandoms(int total, int number, int min){
    int[] arr = new int[number];
    int left = total;
    Random random = new Random();
    for(int i=0; i<number; i++){
        int remainingRolls = number - i;
        int max = left - (remainingRolls - 1) * min;
        int minRolls = Math.max(min, left/remainingRolls);
        if(max - minRolls<0) throw new IllegalArgumentException();
        int rnd = random.nextInt(max - minRolls + 1);
        left -= arr[i] = rnd + minRolls;
    }
    Arrays.sort(arr);
    return arr;
}


