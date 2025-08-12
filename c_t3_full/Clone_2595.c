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
    printf ("Enter a number to reverse\n");
    scanf ("%d", & n);
    for(; n!= 0; n/=10){
        reverse = reverse * 10 + n % 10;
    }
    printf ("Reverse of entered number is = %d\n", reverse);
    return 0;
}


