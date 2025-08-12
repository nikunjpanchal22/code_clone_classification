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
int sum_array(int *a, int n){
    int *p = a;
    int sum = 0;
    for(int i = 0; i < n; i++){
        sum += *p;
        p++;
    }
    return sum;
    }

int main (void) {
    int a [N], i = 0, x = 0;
    printf ("Enter %d Numbers: ", N);
    for (i = 0; i < N; i++)
        scanf ("%d", a+i);
    x = sum_array (a, N);
    printf ("the sum is %d\n", x);
    return 0;
}


