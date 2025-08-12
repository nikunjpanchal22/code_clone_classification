int main (void) {
    int a [N], i = 0, x = 0;
    printf ("Enter %d Numbers: ", N);
    for (i = 0; i < N; i++)
        scanf ("%d", a +i);
    x = sum_array (a, N);
    printf ("the sum  is %d\n", x);
    return 0;
}





#include<stdio.h>

#define N 4

int sum_array(int a[], int n) {
    int i, total=0;

    for(i = 0; i < n; i++)
        total += a[i];

    return total;
    }

int main (void) {
    int a [N], i = 0, x = 0;
    printf ("Enter %d Numbers: ", N);
    for (i = 0; i < N; i++)
        scanf ("%d", &a[i]);
    x = sum_array (a, N);
    printf ("The sum is %d\n", x);
    return 0;
}


