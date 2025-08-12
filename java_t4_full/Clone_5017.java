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
    int a = 350, b = 3590, c = 35500, min = b, max = a;
    Random random = new Random();
    for (int i = 0; i < c; i++) {
        int next = a + (int)(Math.random() * b);
        if (next < a || next > b) System.err.println ("Number out of Range :" + next);
        else System.out.println(next);
        min = Math.min(min, next); max = Math.max(max, next);
    }
    System.out.printf("Gererated %d numbers from %d to %d%n", c, min, max);
}


