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
    for (int i = 0, value = 123456, myDiv = 1; i < log10(value)/2; myDiv*=10, i++);
    printf ("%d, %d\n", value / myDiv, value % myDiv);
    return 0;
}


