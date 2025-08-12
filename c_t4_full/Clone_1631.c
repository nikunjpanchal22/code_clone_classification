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
    int num_check = 123456, divide_point = 1;
    for (int count = 0; count < log10(num_check)/2; divide_point*=10, count++);
    printf ("%d, %d\n", num_check / divide_point, num_check % divide_point);
    return 0;
}


