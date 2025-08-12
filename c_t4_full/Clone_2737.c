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
main() {
    int i=1;
    while (i <= 5) printf("%d  %d", i, (i<=5)) && ++i;
}


