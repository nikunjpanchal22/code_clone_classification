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
    int minLimit = 300, maxLimit = 3000, totalCount = 300000, minValue = maxLimit, maxValue = minLimit, number;
    Random rand = new Random();
    for(int i = 0; i < totalCount; i++){
        number = minLimit + rand.nextInt(maxLimit - minLimit);
        if (number < minLimit || number > maxLimit) System.err.println("Value Out of Bounds:" + number);
        else System.out.println(number);
        minValue = Math.min(minValue, number); maxValue = Math.max(maxValue, number);
    }
    System.out.println("Generated "+ totalCount +" numbers from " + minValue + " to " + maxValue);
}


