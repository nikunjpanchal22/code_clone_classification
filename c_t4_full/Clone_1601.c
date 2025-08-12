int main () {
    int i = 0, N, sum = 0;
    scanf ("%d", & N);
    int ar [N];
    for (i = 0; i < N; i++)
        scanf ("%d", &ar[i]);
    for (i = 0; i < N; i++)
        sum = sum + ar[i];
    printf ("%d\n", sum);
    return 0;
}





#include<stdio.h>
#include<stdlib.h>
int main () {
    int N, sum = 0;
    scanf ("%d", &N);
    int *ar = (int*) malloc(N * sizeof(int));
    for (int *i = ar; i < ar + N; ++i) scanf ("%d", i);
    for (int *i = ar; i < ar + N; ++i) sum += *i;
    printf ("%d\n", sum);
    free(ar);
    return 0;
}


