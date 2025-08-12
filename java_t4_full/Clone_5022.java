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
    int min = 100, max = 1000, n = 100000, lower = max, upper = min, nextNum;
    Random randGenerator = new Random ();
    for (int i=0; i<n; i++) {
        nextNum = min + (int)(Math.random() * ((max - min) + 1));
        if (nextNum < min || nextNum > max) System.err.println ("Not In Range: " + nextNum);
        else System.out.println (nextNum);
        if (nextNum < lower) lower = nextNum;
        if (nextNum > upper) upper = nextNum;
    }
    System.out.println ("Produced " + n + " numbers from " + lower + " to " + upper);
}


