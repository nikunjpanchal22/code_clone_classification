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
    int least = b;
    int greatest = a;
    int count = 100000;
    Random random = new Random ();
    while (count > 0) {
        int nextInt = (int) ((Math.abs (random.nextDouble ()) * (b - a))) + a;
        if (nextInt < a || nextInt > b) {
            System.err.println ("number not in range :" + nextInt);
        } else {
            System.out.println (nextInt);
        }
        if (nextInt < least) {
            least = nextInt;
        }
        if (nextInt > greatest) {
            greatest = nextInt;
        }
        count--;
    }
    System.out.println ("Produced " + (100000 - count) + " numbers from " + least + " to " + greatest);
}
