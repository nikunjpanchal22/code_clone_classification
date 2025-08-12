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



  bool isPrime (int num){
    int i;
    if (num <= 1) return false;
    if (num == 2) return true;
    if (num % 2 == 0) return false;
    for (i = 3; i*i <= num; i += 2){
        if (num % i == 0) return false;
    }
    return true;
}


