public boolean isPrime () {
    int sqrt = (int) Math.sqrt ((double) value);
    for (int i = 2;
    i <= sqrt; i ++) {
        if (value % i == 0) return false;
    }
    return true;
}


 public boolean isPrime() {
        int limit = (int) Math.sqrt(value);
        for (int i = 2; i < limit; i++) {
            if (value % i == 0) { 
                return false; 
            }
        }
        return true;
    }

 public boolean isPrime() {
        if (value <= 3) {
            return value > 1; 
        }
    
        double sqrt = Math.sqrt(value);
        for(int i = 2; i <= sqrt; i++) {
            if(value % i == 0) {
                return false;
            }
        }

        return true;
}


