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
    int a = 100;
    int b = 1000;
    int leastNumber = b;
    int highestNumber = a;
    int count = 100000;
    Random random = new Random ();
    while (count > 0) {
        int next = (int) ((Math.abs (random.nextDouble ()) * (b - a))) + a;
        if (next < a || next > b) {
            System.err.println ("number not in range :" + next);
        } else {
            System.out.println (next);
        }
        if (next < leastNumber) {
            leastNumber = next;
        }
        if (next > highestNumber) {
            highestNumber = next;
        }
        count--;
    }
    System.out.println ("Generated " + (100000 - count) + " random numbers with a range of " + leastNumber + " to " + highestNumber);
}
