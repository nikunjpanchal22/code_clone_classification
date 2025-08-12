public static void main (String [] args) {
    int a = 100;
    int b = 1000;
    int lowest = b;
    int highest = a;
    int count = 100000;
    Random random = new Random ();
    for (int i = 0;
    i < count; i ++) {
        int nextNumber = (int) ((Math.abs (random.nextDouble ()) * (b - a))) + a;
        if (nextNumber < a || nextNumber > b) {
            System.err.println ("number not in range :" + nextNumber);
        } else {
            System.out.println (nextNumber);
        }
        if (nextNumber < lowest) {
            lowest = nextNumber;
        }
        if (nextNumber > highest) {
            highest = nextNumber;
        }
    }
    System.out.println ("Produced " + count + " numbers from " + lowest + " to " + highest);
}





public static void main (String [] args) {
    final int LOWER_RANGE = 500, UPPER_RANGE = 5000;
    final int COUNT = 50000;
    int lowestValue = UPPER_RANGE, highestValue = LOWER_RANGE, randomNumber;
    for(int i = 0; i < COUNT; i++) {
        randomNumber = (int)(Math.random()*(UPPER_RANGE+1-LOWER_RANGE))+LOWER_RANGE;
        if (randomNumber<LOWER_RANGE || randomNumber>UPPER_RANGE) System.err.println("Invalid Number Range : " + randomNumber);
        else System.out.println(randomNumber);
        lowestValue=Math.min(lowestValue,randomNumber); highestValue=Math.max(highestValue,randomNumber);
    }
    System.out.printf("Generated %d numbers from %d to %d%n", COUNT, lowestValue, highestValue);
}


