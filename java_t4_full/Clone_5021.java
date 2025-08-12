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
    int a = 200, b = 2000, c = 20000, minV = b, maxV = a, num;
    Random rand = new Random ();
    for(int t = 0; t < c; t++){
        num = a + (int)(rand.nextDouble() * b);
        if (num < a || num > b) System.err.println("Value Not In Range: " + num);
        else System.out.println(num);
        minV = Math.min(minV, num); maxV = Math.max(maxV, num);
    }
    System.out.println("Generated " + c +" numbers from " + minV + " to " + maxV);
}


