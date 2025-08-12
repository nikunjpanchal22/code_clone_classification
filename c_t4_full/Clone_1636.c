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
    int x = 123456;
    int div = pow(10, floor(log10(x) / 2));
    printf ("%d, %d\n", x / div, x % div);
    return 0;
}


