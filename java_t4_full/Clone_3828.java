boolean isPrime (int x) {
    for (int i = 2;
    i * i <= x; i ++) {
        if (x % i == 0) {
            return false;
        }
    }
    return true;
}





boolean isPrime(int n) {
    if(n<=1) return false;
    if(n==2 || n==3) return true;
    if(n%2==0 || n%3==0) return false;

    int sqrtN = (int)Math.sqrt(n)+1;
    for(int i=6;i<=sqrtN;i+=6) {
        if(n%(i-1)==0 || n%(i+1)==0) return false;
    }

    return true;
}


