int main (void) {
    unsigned int a [N];
    printf ("Enter %zu numbers: ", (size_t) N);
    for (size_t i = 0; i < N; i++) {
        scanf ("%u", & a [i]);
    }
    printf ("Prime numbers are: ");
    for (size_t i = 0; i < N; i++) {
        int prime = a[i] == 2 || a[i] % 2 == 1 && a[i] != 1;
        for (unsigned int j = 3; prime && j <= a[i] / j; j += 2) {
            prime = a[i] % j != 0;
        }
        if (prime)
            printf ("%u, ", a[i]);
    }
    putchar ('\n');
    return 0;
}




#include<stdio.h>
#define N 50
int main () {
    unsigned int num[N], i, j, flag;
    printf ("Enter %d numbers:\n", N);
    for (i = 0; i < N; i++) {
        scanf ("%u", &num[i]);
    }
    printf ("Prime numbers are: ");
    for (i = 0; i < N; i++) {
        if (num[i] == 1) {
            continue;
        }
        flag = 0; 
        for (j = 2; j <= num[i] / 2; j++) {
            if (num[i] % j == 0) {
                flag = 1;
                break;
            }
        }
        if (flag==0){
            printf ("%u, ", num[i]);
        }
    }
    printf("\n");
    return 0;
}


