public boolean isPrime () {
    int sqrt = (int) Math.sqrt ((double) value);
    for (int i = 2;
    i <= sqrt; i ++) {
        if (value % i == 0) return false;
    }
    return true;
}


 public Boolean isPrime() {
    if (value == 2) return true;

    int max = (int) Math.sqrt(value);
    for (int counter = 2; counter <= max; counter++) {
        if (value % counter == 0) return false;
    }
    return true;

}


