public boolean isPrime () {
    int sqrt = (int) Math.sqrt ((double) value);
    for (int i = 2;
    i <= sqrt; i ++) {
        if (value % i == 0) return false;
    }
    return true;
}





public boolean isPrime() {
      int sqrt = (int) Math.sqrt((double) value);
      BitSet bs = new BitSet(sqrt+1);
      bs.set(2, sqrt+1);
      for (int i = bs.nextSetBit(0); i >= 0; i = bs.nextSetBit(i+1)) {
        if (value % i == 0) return false;
        if (i * i <= sqrt) bs.clear(i * i, sqrt + 1);
      }
      return true;
}


