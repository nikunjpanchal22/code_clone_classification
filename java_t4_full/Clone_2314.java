public boolean isPrime () {
    int sqrt = (int) Math.sqrt ((double) value);
    for (int i = 2;
    i <= sqrt; i ++) {
        if (value % i == 0) return false;
    }
    return true;
}


 public boolean isPrime() {
        if(value < 2) return false; 
        if(value == 2) return true; 
        if(value % 2 == 0) return false; 
        for(int i = 3; i * i <= value; i += 2) {  
            if(value % i == 0) return false; 
        }
        return true; 
}


