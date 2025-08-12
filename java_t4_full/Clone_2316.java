public boolean isPrime () {
    int sqrt = (int) Math.sqrt ((double) value);
    for (int i = 2;
    i <= sqrt; i ++) {
        if (value % i == 0) return false;
    }
    return true;
}


 public boolean isPrime() { 
    double sqr = Math.sqrt(value); 
      
    // if even, then is not prime 
    if (value % 2 == 0) 
        return false; 
  
    // check odd numbers from 3 to the square root of n 
    for (int i = 3; i <= sqr; i += 2) { 
        if (value % i == 0) 
            return false; 
    } 
    return true; 
}


