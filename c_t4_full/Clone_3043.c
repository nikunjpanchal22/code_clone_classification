int main () {
    int n, count;
    printf ("Insert a number:\n");
    scanf ("%d", & n);
    count = 0;
    n++;
    for (; count < 10; n++) {
        if (isPrime (n)) {
            printf ("%d\n", n);
            count++;
        }
    }
    return 0;
}






bool isPrime(int n) {
        if(n <= 1) return false;
        for(int i = 2; i * i <= n; i++) {
            if(n%i == 0) return false;
        }
        return true;
    }

    int main () {
        int n;
        char count=0;
        printf("Insert a number:\n");
        scanf("%d", & n);
        n++;
        while(count < 10) {
            if(isPrime(n)) {
                printf("%d\n", n);
                count++;
            }
            n++;
        }
        return 0;
}


