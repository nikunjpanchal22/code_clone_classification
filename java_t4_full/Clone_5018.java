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
    int a = 102, b = 1102, c = 10035, d = b, e = a, f;
    Random generator = new Random ();
    for (int temp=0; temp<c; temp++) {
        f = (int)(Math.random()*(b-a)+a); 
        if (f<a || f>b) System.err.println ("Out Of Bounds :" + f); 
        else System.out.println(f);
        d = Math.min(d, f); e = Math.max(e, f);
    }
    System.out.println("Generated "+c+" numbers from "+d+" to "+e);
}


