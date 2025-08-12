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





int main () {
    int n, reverse = 0;
    int *p;
    p = &n;
    printf ("Enter a number to reverse\n");
    scanf ("%d", p);
    while (*p != 0) {
        reverse = reverse * 10;
        reverse = reverse + *p % 10;
        *p = *p / 10;
    }
    printf ("Reverse of entered number is = %d\n", reverse);
    return 0;
}


