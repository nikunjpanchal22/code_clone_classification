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
    int divider = 0, tempNum;
    for (int i = 0 ; n > 0 ; i++) {
        tempNum = n % 10;
        divider = divider * 10;
        n = n / 10;
        if(i == (getNumberOfDigits (n) / 2) - 1) {
            break;
        }
    }
    printf ("%d, %d\n", (n / divider), (n % divider));
    return 0;
}


