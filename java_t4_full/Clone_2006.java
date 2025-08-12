bool isPrime (int number) {
    if (number < 2) return false;
    if (number == 2) return true;
    if (number % 2 == 0) return false;
    for (int i = 3;
    (i * i) <= number; i += 2) {
        if (number % i == 0) return false;
    }
    return true;
}


 bool isPrime(int x) 
{ 
    // Corner cases 
    if (x <= 1) return false; 
    if (x <= 3) return true; 
  
    // This is checked so that we can skip  
    // middle five numbers in below loop 
    if (x % 2 == 0 || x % 3 == 0) return false; 
  
    for (int i = 5; i * i <= x; i = i + 6) 
        if (x % i == 0 || x % (i + 2) == 0) 
            return false; 
  
    return true; 
} 


