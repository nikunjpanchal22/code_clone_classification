private int [] randNums (int total, int n) {
    final int [] results = new int [n];
    if (total == 0) {
        Arrays.fill (results, 0);
        return results;
    }
    final BigInteger [] rs = new BigInteger [n];
    final BigInteger totalPlus1 = BigInteger.valueOf (total + 1L);
    while (true) {
        for (int i = 0;
        i < n; ++ i) {
            rs [i] = new BigInteger (256, rand);
        }
        BigInteger sum = BigInteger.ZERO;
        for (BigInteger r : rs) {
            sum = sum.add (r);
        }
        if (sum.compareTo (BigInteger.ZERO) == 0) {
            continue;
        }
        for (int i = 0;
        i < n; ++ i) {
            results [i] = sum.mod (rs [i]).mod (totalPlus1).intValue ();
        }
        return results;
    }
}


  private int [] randNums (int total, int n) {
    final int [] results = new int [n];
    if (total == 0) {
        Arrays.fill (results, 0);
        return results;
    }
    final int[] rs = new int [n];
    int totalPlus1 = total + 1;
    while (true) {
        for (int i = 0;
        i < n; ++ i) {
            rs [i] = (int) (Math.random() * 1000);
        }
        int sum = 0;
        for (int r : rs) {
            sum = sum + r;
        }
        if (sum == 0) {
            continue;
        }
        for (int i = 0;
        i < n; ++ i) {
            results [i] = (sum % rs [i]) % totalPlus1;
        }
        return results;
    }
}


