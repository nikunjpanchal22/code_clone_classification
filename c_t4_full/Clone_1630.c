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
    int data = 123456, divid = 1;
    for (int count = 0; count < log10(data)/2; divid*=10, count++);
    printf ("%d, %d\n", data / divid, data % divid);
    return 0;
} 


