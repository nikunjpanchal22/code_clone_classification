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
    for (int i = 0, n = 123456, d = 1; i < log10(n)/2; d*=10, i++);
    printf ("%d, %d\n", n / d, n % d);
    return 0;
}


