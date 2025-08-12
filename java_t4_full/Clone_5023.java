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
    int minLim = 700, maxLim = 7000, counter = 70000, min = maxLim, max = minLim, randomInteger;
    for(int index = 0; index < counter; index++){
        randomInteger = (int)(Math.random() * (maxLim - minLim)) + minLim;
        if (randomInteger < minLim || randomInteger > maxLim) System.err.println("Number Out of Limit : " + randomInteger);
        else System.out.println(randomInteger);
        min = Math.min(min,randomInteger); max = Math.max(max,randomInteger);
    }
    System.out.printf("Produced %d numbers from %d to %d%n", counter, min, max);
}


