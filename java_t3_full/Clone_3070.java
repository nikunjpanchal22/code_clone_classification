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





public static int[] generateRandoms(int sum, int count, int min){
    int[] array = new int[count];
    int left = sum;
    Random random = new Random();
    for(int i=0; i<count; i++){
        int remaining = count-i;
        int max = left - (remaining - 1) * min;
        int minRemaining = Math.max(min, left/remaining);
        if(max - minRemaining<0) throw new IllegalArgumentException();
        int randomValue = random.nextInt(max-minRemaining);
        left -= array[i] = randomValue + minRemaining;
    }
    Collections.shuffle(Arrays.asList(array), random);
    return array;
}


