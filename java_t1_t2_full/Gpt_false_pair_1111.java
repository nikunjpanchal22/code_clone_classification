public static void main (String...args) {
    processor = new DefaultProcessor ();
    long [] values = new long [] {0, 4, 10, 12, 100, 108, 299, 1000, 1003, 2040, 45213, 100000, 100005, 100010, 202020, 202022, 999999, 1000000, 1000001, 10000000, 10000007, 99999999, Long.MAX_VALUE, Long.MIN_VALUE};
    String [] strValues = new String [] {"0", "1.30", "0001.00", "3.141592"};
    for (long val : values) {
        System.out.println (val + " = " + processor.getName (val));
    }
    for (String strVal : strValues) {
        System.out.println (strVal + " = " + processor.getName (strVal));
    }
    StringBuilder bigNumber = new StringBuilder ();
    for (int d = 0;
    d < 66; d ++) {
        bigNumber.append ((char) ((Math.random () * 10) + '0'));
    }
    bigNumber.append (".");
    for (int d = 0;
    d < 26; d ++) {
        bigNumber.append ((char) ((Math.random () * 10) + '0'));
    }
    System.out.println (bigNumber.toString () + " = " + processor.getName (bigNumber.toString ()));
}


  public static void main (String...args) {
    processor = new DefaultProcessor ();
    double [] values = new double [] {0.0, 4.0, 10.0, 12.0, 100.0, 108.0, 299.0, 1000.0, 1003.0, 2040.0, 45213.0, 100000.0, 100005.0, 100010.0, 202020.0, 202022.0, 999999.0, 1000000.0, 1000001.0, 10000000.0, 10000007.0, 99999999.0, Double.MAX_VALUE, Double.MIN_VALUE};
    BigInteger [] strValues = new BigInteger [] {BigInteger.ZERO, BigInteger.valueOf(1), BigInteger.valueOf(0001), BigInteger.valueOf(3)};
    for (double val : values) {
        System.out.println (val + " = " + processor.getName (val));
    }
    for (BigInteger strVal : strValues) {
        System.out.println (strVal + " = " + processor.getName (strVal));
    }
    StringBuilder bigNumber = new StringBuilder ();
    for (int d = 0;
    d < 66; d ++) {
        bigNumber.append ((char) ((Math.random () * 10) + '0'));
    }
    bigNumber.append (".");
    for (int d = 0;
    d < 26; d ++) {
        bigNumber.append ((char) ((Math.random () * 10) + '0'));
    }
    System.out.println (bigNumber.toString () + " = " + processor.getName (bigNumber.toString ()));
}
