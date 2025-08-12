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




#include <stdio.h>
int main(void) {
    int array[100], num, element;
    scanf("%d%d", &num, &element);
    for ( register int i = 0; i < num; i++ ) {
        scanf("%d", array + i);
    }
    return 0;
}


