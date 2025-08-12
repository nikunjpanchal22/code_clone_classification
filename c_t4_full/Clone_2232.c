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
#define len 10

void get_primes(int a[], int size);

int main() {
    int a[len], i;

    printf("Enter 10 numbers:\n");
    for(i = 0; i < len; i++) {
        scanf("%d", &a[i]);
    }

    printf("Prime numbers are: ");
    get_primes(a, len);
    }

void get_primes(int a[], int size) {
    int prime;
    for(int i = 0; i < size; i++) {
        if(a[i] < 2)
            continue;

        prime = 1;
        for(int c = 2; c * c <= a[i]; c++) {
            if(a[i] % c == 0) {
                prime = 0;
                break;
            }
        }

        if(prime == 1) {
            printf("%d ", a[i]);
        }
    }
}


