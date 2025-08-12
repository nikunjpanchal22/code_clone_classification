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

#define fun(n)  // implement function

int main() {
    int n;
    scanf("%d", &n);
    int *a = (int*) calloc(n*n, sizeof(int));

    for(int i=0; i<n*n; i++) {
            scanf("%d", &a[i]);
    }
    fun(n);
    free(a);
    return 0;
}


