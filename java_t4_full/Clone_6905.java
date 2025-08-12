public boolean isPrime () {
    int sqrt = (int) Math.sqrt ((double) value);
    for (int i = 2;
    i <= sqrt; i ++) {
        if (value % i == 0) return false;
    }
    return true;
}





public boolean isPrime() {
  int sqrt = (int) Math.sqrt(value);
  return IntStream.rangeClosed(2, sqrt).noneMatch(i -> value % i == 0);
}


