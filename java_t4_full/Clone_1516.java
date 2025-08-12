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


 public static int [] genRandoms (int total, int numberOfRandoms, int minimumValue) {
    int [] ret = new int [numberOfRandoms];
    int[] array = new int[total];
    for (int i = 0; i < total; i++) {
        array[i] = i + 1;
    }
    Random rnd = new Random ();
    int totalLeft = total;
    for (int i = 0;
    i < numberOfRandoms; i ++) {
        int rndIndex = rnd.nextInt(totalLeft);
        ret[i] = array[rndIndex] + minimumValue;
        array[rndIndex] = array[totalLeft - 1];
        totalLeft--;
    }
    Collections.shuffle (Arrays.asList (ret), rnd);
    return ret;
}


