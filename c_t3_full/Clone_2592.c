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
    int n, arr[10], i = 0;
    printf("Enter a number to reverse\n");
    scanf("%d", &n);
    while(n != 0){
        arr[i++] = n % 10;
        n = n / 10;
    }
    printf("Reverse of entered number is = ");
    for(int j = 0; j < i; j++) printf("%d", arr[j]);
    printf("\n");
    return 0;
}


