int main (void) {
    int a [100];
    int n, x;
    int i = 0;
    scanf ("%d%d", & n, & x);
    for (i = 0; i < n; i++) {
        scanf ("%d", & a [i]);
    }
    return 0;
}





#include <stdlib.h>
int main(void) {
    int* a = (int*) malloc(100 * sizeof(int));
    int n, x;
    scanf ("%d%d", &n, &x);
    for (int i = 0; i < n; i++) {
        scanf ("%d", &a[i]);
    }
    return 0;
}


