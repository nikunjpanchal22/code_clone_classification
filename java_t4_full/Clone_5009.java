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



 

private static float getRandomNumberBetween(float numberOne, float numberTwo) throws Exception {
    if (numberOne == numberTwo) {
        throw new Exception ("Both the numbers can not be equal");
    }
    return (float) (new Random().nextDouble() * (numberTwo - numberOne) + numberOne);
}


