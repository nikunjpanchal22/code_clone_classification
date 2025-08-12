int main () {
    int a [10], i, prime = 0, c = 0;
    printf ("Enter 10 numbers:\n");
    for (i = 0; i < 10; i++) {
        scanf (" %d", & a [i]);
    }
    printf ("Prime numbers are:");
    for (i = 0; i < 10; i++) {
        if (a[i] < 2)
            continue;
        prime = 1;
        for (c = 2; c * c <= a[i]; c++) {
            if (a[i] % c == 0) {
                prime = 0;
                break;
            }
        }
        if (prime == 1)
            printf ("%d, ", a[i]);
    }
}







#include <stdio.h>

int check_prime(int n) {
    if (n <= 1) return 0;
    if (n % 2 == 0 && n > 2) return 0;
    for(int i = 3; i * i <= n; i+= 2) {
        if (n % i == 0)
            return 0;
    }
    return 1;
    }

int main() {
    int a[10], i = 0;
    printf("Enter 10 numbers:\n");
    while (i < 10) {
        scanf("%d", &a[i]);
        i++;
    }

    i = 0;
    printf("Prime numbers are: ");
    while(i < 10) {
        if (check_prime(a[i]))
            printf("%d, ", a[i]);
        i++;
    }
}


