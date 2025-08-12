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





int main() {
    char num[10];
    printf("Enter a number to reverse\n");
    fgets(num, sizeof(num), stdin);
    printf("Reverse of entered number is = ");
    for(int i = strlen(num)-2; i >= 0; i--) {
        printf("%c", num[i]);
    }
    printf("\n");
    return 0;
}


