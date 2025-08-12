int main (void) {
    int n = 123456;
    int divider = 1;
    for (int i = 0; i < getNumberOfDigits (n) / 2; i++) {
        divider *= 10;
    }
    printf ("%d, %d\n", n / divider, n % divider);
    return 0;
}


 int main (void) {
    int n = 123456; 
    int divider = 1; 
    while (getNumberOfDigits (n) > 2) {
        divider *= 10;
        n /= 10;
    }
    printf ("%d, %d\n", n / divider, n % divider);
    return 0;
}
