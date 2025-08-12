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
int main (void) {
    int array [100];
    int len, elem;
    scanf ("%d%d", &len, &elem);
    int i = 0;
    do{
        if(i>=len) break;
        scanf ("%d", &array [i]);
        i++;
    }while(1);
    return 0;
}


