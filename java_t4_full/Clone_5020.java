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
    int a = 150, b = 1500, c = 15000, d = b, e = a, f;
    Random randomValue = new Random();
    for(int i = 0; i < c; i++){
        f = a + (int)(Math.random() * b);
        if (f<a || f>b) System.err.println ("Number Out of Range :" + f);
        else System.out.println(f);
        d = Math.min(f, d); e = Math.max(f, e);
    }
    System.out.println("Generated "+ c +" numbers from "+ d +" to "+ e);
}


