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
    int lowerLim = 400, upperLim = 4000, totalNum = 40000, minimum = upperLim, maximum = lowerLim, randomNum;
    Random randObj = new Random();
    for(int counter = 0; counter < totalNum; counter++){
        randomNum = (int)(Math.random() * upperLim) + lowerLim;
        if (randomNum<lowerLim || randomNum>upperLim) System.err.println("Output Value Not in Desired Range :" + randomNum);
        else System.out.println(randomNum);
        minimum=Math.min(minimum,randomNum); maximum=Math.max(maximum,randomNum);
    }
    System.out.println("Generated "+ totalNum + " numbers from " + minimum + " to " + maximum);
}


