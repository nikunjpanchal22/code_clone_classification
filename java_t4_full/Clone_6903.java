public boolean isPrime () {
    int sqrt = (int) Math.sqrt ((double) value);
    for (int i = 2;
    i <= sqrt; i ++) {
        if (value % i == 0) return false;
    }
    return true;
}





public boolean isPrime () {
      int sqrt = (int) Math.sqrt ((double) value);
      Iterator<Integer> iterator = IntStream.rangeClosed(2, sqrt).iterator();
      while (iterator.hasNext()) {
        if (value % iterator.next() == 0) return false;
      }
      return true;
}


