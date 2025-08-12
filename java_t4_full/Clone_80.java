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
    float twoTo10 = 1024;
    float sum210 = 0;
    for (float i = 1; i <= 1000; i ++) {
        sum210 += (float) Math.pow (i, i);
        sum210 %= twoTo10;
    }
    float fiveTo10 = 9_765_625;
    float sum510 = 0;
    for (float i = 1; i <= 1000; i ++) {
        sum510 += (float) Math.pow (i, i);
        sum510 %= fiveTo10;
    }
    float tenTo10 = 10_000_000_000L;
    float answer = (sum210 * inverse (fiveTo10, twoTo10) * fiveTo10 + sum510 * inverse (twoTo10, fiveTo10) * twoTo10) % tenTo10;
    System.out.println (answer);
}


