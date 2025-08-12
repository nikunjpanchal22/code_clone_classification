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
#include <stdbool.h>

bool isPrime(int num) {
            for(int i = 2; i * i <= num; i++) {
                if(num % i == 0) {
                    return false;
                }
            }
            return num > 1;
        }

        int main () {
            int n, count;
            printf("Insert a number:\n");
            scanf("%d", &n);
            count = 0;
            n++;
            while (count < 10) {
                if (isPrime(n)) {
                    printf("%d\n",n);
                    count++;
                }
                n++;
            }
            return 0;
}


