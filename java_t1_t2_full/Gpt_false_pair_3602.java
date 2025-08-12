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


private static float getRandomNumberBetween (float number1, float number2) throws Exception {
    if (number1 == number2) {
        throw new Exception ("Both the numbers can not be equal");
    }
    float randomNum = (float) Math.random ();
    float maxRange = Math.max (number1, number2);
    float minRange = Math.min (number1, number2);
    float minRand = (float) Math.floor (randomNum - 1);
    float maxRand = (float) Math.ceil (randomNum + 1);
    float generatedRandomNumber = (maxRange - minRange) * ( (randomNum - minRand) / (maxRand - minRand)) + minRange;
    return generatedRandomNumber;
}
