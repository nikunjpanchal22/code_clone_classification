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


 bool isPrime(int n)
{
    int prime = 1;
    if (n < 2) prime = 0;
    else if (n == 2) prime = 1;
    else if (n % 2 == 0) prime = 0;

    int divisor;
    for (divisor = 3; divisor * divisor <= n; divisor += 2)
    {
        if (n % divisor == 0) prime = 0;
    }

    return prime;
}


