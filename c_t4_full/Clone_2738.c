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
    int i = 1;
    int j = i <= 5;
    while (j != 0) {
        printf ("%d  %d", ++i, j = i <= 5);
    }
    return 0;
}


