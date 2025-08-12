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
      int i = 2;
      if (sqrt < 2) return true;
      do {
        if (value % i == 0) return false;
        i++;
      } while (i <= sqrt);
      return true;
}


