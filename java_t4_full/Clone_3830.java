boolean isPrime (int x) {
    for (int i = 2;
    i * i <= x; i ++) {
        if (x % i == 0) {
            return false;
        }
    }
    return true;
}





boolean isPrime(int num) {
    if (num > 2 && num%2 == 0) return false;
    int top = (int)Math.sqrt(num) + 1;
    for(int i = 3; i < top; i+=2){
        if(num % i == 0) return false;
    }
    return true;
}


