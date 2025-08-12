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
#define MAX_COUNT 10

int isPrime(int num) {
            for(int i = 2; i * i <= num; i++) {
                if(num % i == 0) {
                    return 0;
                }
            }
            return num > 1 ? 1 : 0;
        }

        int main () {
            int n, count;
            printf("Insert a number:\n");
            scanf("%d", &n);
            for(count = 0, n++; count < MAX_COUNT; n++) {
                if (isPrime(n)) {
                    printf("%d\n", n);
                    count++;
                }
            }
            return 0;
}


