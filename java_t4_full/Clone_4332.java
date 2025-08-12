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




public static void main(String... args) {
    processor = new DefaultProcessor();
    List<Long> valList = Arrays.asList(0L, 4L, 10L, 12L, 100L, 108L, 299L);
    valList.forEach(val -> System.out.println (val + " = " + processor.getName(val)));
}


