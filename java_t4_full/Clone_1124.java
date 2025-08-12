private static float getRandomNumberBetween (float numberOne, float numberTwo) throws Exception {
    if (numberOne == numberTwo) {
        throw new Exception ("Both the numbers can not be equal");
    }
    float rand = (float) Math.random ();
    float highRange = Math.max (numberOne, numberTwo);
    float lowRange = Math.min (numberOne, numberTwo);
    float lowRand = (float) Math.floor (rand - 1);
    float highRand = (float) Math.ceil (rand + 1);
    float genRand = (highRange - lowRange) * ((rand - lowRand) / (highRand - lowRand)) + lowRange;
    return genRand;
}


 private static float getRandomNumberBetween (float min, float max) throws Exception {
    if (min == max) {
        throw new Exception ("Both numbers can not be equal");
    }
    float delta = max - min;
    float randomNumberInRange = (float) (Math.random() * delta) + min;
    return randomNumberInRange;
}


