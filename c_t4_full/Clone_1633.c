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
    int num = 123456, div = 1, i, digits = (int)log10(num) + 1;
    for (i = 0; i < digits / 2; i++) div *= 10;
    printf ("%d, %d\n", num / div, num % div);
    return 0;
}


