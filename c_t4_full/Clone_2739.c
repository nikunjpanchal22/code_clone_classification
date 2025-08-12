int main (void) {
    int i = 1, j = 1;
    while (j != 0) {
        j = (i <= 5);
        i = i + 1;
        printf ("%d  %d", i, j);
    }
    return 0;
}


  
 

#include <stdio.h>
int main (void) {
    for (int i=1, j=1;;) {
        if(j == 0) break;
        printf ("%d  %d", ++i, j=(i<=5));
    }
    return 0;
}


