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
    if(n<3) return (n==2);
    for(int i=2;i*i<n;i++)
        if(n%i==0)return false;
    return true;
}


