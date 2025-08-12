public static void main (String [] args) {
    long twoTo10 = 1024;
    long sum210 = 0;
    for (long i = 1;
    i <= 1000; i ++) {
        sum210 += pow (i, i, twoTo10);
        sum210 %= twoTo10;
    }
    long fiveTo10 = 9_765_625;
    long sum510 = 0;
    for (long i = 1;
    i <= 1000; i ++) {
        sum510 += pow (i, i, fiveTo10);
        sum510 %= fiveTo10;
    }
    long tenTo10 = 10_000_000_000L;
    long answer = sum210 * inverse (fiveTo10, twoTo10) * fiveTo10 + sum510 * inverse (twoTo10, fiveTo10) * twoTo10;
    answer %= tenTo10;
    System.out.println (answer);
}


 public static void main (String [] args) {
    double twoTo10 = 1024;
    double sum210 = 0;
    for (double i = 1; i <= 1000; i ++) {
        sum210 += Math.pow (i, i);
        sum210 %= twoTo10;
    }
    double fiveTo10 = 9_765_625;
    double sum510 = 0;
    for (double i = 1; i <= 1000; i ++) {
        sum510 += Math.pow (i, i);
        sum510 %= fiveTo10;
    }
    double tenTo10 = 10_000_000_000L;
    double answer = (sum210 * inverse (fiveTo10, twoTo10) * fiveTo10 + sum510 * inverse (twoTo10, fiveTo10) * twoTo10) % tenTo10;
    System.out.println (answer);
}


