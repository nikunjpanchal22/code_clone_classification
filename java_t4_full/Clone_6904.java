public boolean isPrime () {
    int sqrt = (int) Math.sqrt ((double) value);
    for (int i = 2;
    i <= sqrt; i ++) {
        if (value % i == 0) return false;
    }
    return true;
}





public boolean isPrime() {
      return isPrimeUtil((int)Math.sqrt(value), 2);
    }

    private boolean isPrimeUtil(int sqrt, int i) {
      if (i > sqrt) return true;
      if (value % i == 0) return false;
      return isPrimeUtil(sqrt, i + 1);
}


