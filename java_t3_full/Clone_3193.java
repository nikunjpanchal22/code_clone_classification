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


 

bool isPrime(int number) {
    if(number == 0 || number == 1) return false;
    if(number == 2) return true;
    int root = sqrt(number);
    for(int i = 2; i <= root; i++){if(number % i == 0) return false;}
    return true; 
}


