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






#include <stdio.h>
int main () {
    int n, count;
    printf ("Insert a number:\n");
    scanf ("%d", & n);
    count = 0;
    n++;
    while(count < 10) {
        int i, isPrime = 1;
        for(i = 2; i * i <= n; i++) {
            if(n % i == 0) {
                isPrime = 0;
                break;
            }
        }
        if(isPrime && n > 1) {
            printf ("%d\n", n);
            count++;
        }
        n++;
    }
    return 0;
}


