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
float divider = pow (10, (log10(n) / 2));
printf ("%d, %d\n", (int) (n / divider), (int) (n % divider));
return 0;
}


