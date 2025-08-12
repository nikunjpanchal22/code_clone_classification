int main (void) {
    int n;
    scanf ("%d", & n);
    a = (int **) malloc (n * sizeof (int *));
    for (int i = 0; i < 5; i++) {
        a[i] = (int *) malloc (n * sizeof (int));
    }
    for (int i = 0; i < n; i++) {
        for (int j = 0; j < n; j++) {
            scanf ("%d", & a [i] [j]);
        }
    }
    fun (n);
    return 0;
}





#include <stdio.h>
#include <stdlib.h>

void fun(int n){/* implement function */ return;}

int main (void) {
    int n;
    scanf ("%d", & n);
    int **a = (int **) malloc (n * sizeof (int *));
    int i, j;
    for (i = 0; i < n; i++) {
        a[i] = (int *) malloc (n * sizeof (int));
        for (j = 0; j < n; j++) {
            scanf ("%d", & a [i] [j]);
        }
    }
    fun (n);
    return 0;
}


