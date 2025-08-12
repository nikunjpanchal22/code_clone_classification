int main (void) {
    int n = 123456;
    int divider = 1;
    for (int i = 0; i < getNumberOfDigits (n) / 2; i++) {
        divider *= 10;
    }
    printf ("%d, %d\n", n / divider, n % divider);
    return 0;
}




int main () {
    int num = 123456, divisor = 1, i = 0;
    while(i++ < log10(num)/2) divisor *= 10;
    printf ("%d, %d\n", num / divisor, num % divisor);
    return 0;
}


