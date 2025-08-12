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





public static int[] createRandomArray(int total, int num, int min){
    int[] arr = new int[num];
    int totalLeft = total;
    Random rand = new Random();
    for(int i=0; i<num; i++){
        int remaining = num - i;
        int max = totalLeft - (remaining - 1) * min;
        int minLeft = Math.max(min, totalLeft/remaining);
        if(max - minLeft < 0) throw new IllegalArgumentException();
        int rndValue = rand.nextInt(max - minLeft + 1);
        totalLeft -= arr[i] = rndValue + minLeft;
    }
    Arrays.sort(arr);
    return arr;
}


