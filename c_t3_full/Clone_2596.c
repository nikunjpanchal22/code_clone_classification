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





void reverseNum(int n, int *reverse){
    if (n == 0) 
        return;
    *reverse = *reverse * 10;
    *reverse = *reverse + n % 10;
    reverseNum(n / 10, reverse);
    }
int main () {
    int n, reverse = 0;
    printf ("Enter a number to reverse\n");
    scanf ("%d", & n);
    reverseNum(n, &reverse);
    printf("Reverse of entered number is = %d\n", reverse);
    return 0;
}


