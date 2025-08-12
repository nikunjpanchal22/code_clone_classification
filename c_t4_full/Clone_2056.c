int main () {
    int n, reverse = 0;
    printf ("Enter a number to reverse\n");
    scanf ("%d", & n);
    while (n != 0) {
        reverse = reverse * 10;
        reverse = reverse + n % 10;
        n = n / 10;
    }
    printf ("Reverse of entered number is = %d\n", reverse);
    return 0;
}





int reverse(int n){
    int sign = n;
    n = sign < 0? -n: n;
    int reverse = 0;
    while(n > 0){
        reverse = (reverse << 3) + (reverse << 1) + n % 10;
        n = n / 10;
    }
    return sign > 0? reverse: -reverse;
    }
int main () {
    int n;
    printf ("Enter a number to reverse\n");
    scanf ("%d", & n);
    printf ("Reverse of entered number is = %d\n", reverse(n));
    return 0;
}


