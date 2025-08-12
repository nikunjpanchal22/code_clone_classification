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
    int number = 123456; 
    int divisor = 1; 
    int size = floor(log10(number)) + 1;
    for (int i = 0; i < size / 2; i++) { 
        divisor *= 10; 
    } 
    printf ("%d, %d\n", number / divisor, number % divisor); 
    return 0; 
}


