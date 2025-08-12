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
    int j = 1;
    while (true) {
        if(!(j = (i <= 5))) break;
        printf ("%d  %d", ++i, j);
    }
    return 0;
}


