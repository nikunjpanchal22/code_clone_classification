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


 bool isPrime(int num) 
{ 
    if (num <= 1)  return false; 
    if (num <= 3)  return true; 
   
    if (num % 2 == 0 || num % 3 == 0) return false; 
   
    for (int i = 5; i * i <= num; i = i + 6) 
        if (num % i == 0 || num % (i + 2) == 0) 
            return false; 
   
    return true; 
} 


