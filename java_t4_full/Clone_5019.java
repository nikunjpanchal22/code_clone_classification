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
    int lowerLimit = 500, upperLimit = 5000, totalNumbers = 50000, smallest = upperLimit, largest = lowerLimit, num;
    Random util = new Random();
    for (int k = 0; k < totalNumbers; k++){
        num = lowerLimit + (int)(Math.random() * ((upperLimit - lowerLimit) + 1));
        if (num < lowerLimit || num > upperLimit) System.err.println("Number Out Of Bounds : " + num);
        else System.out.println(num);
        smallest = Math.min(smallest, num); largest = Math.max(largest, num);
    }
    System.out.println("Generated "+totalNumbers+" numbers from "+smallest+" to "+largest);
}


