int main () {
    int n = 6;
    int tab [] = {1, 2, 8, 4, 5, 6};
    int maxdiff = 0;
    for (int i = 1; i < n; i++) {
        int diff = abs (tab[i] - tab[i - 1]);
        if (diff > maxdiff) {
            maxdiff = diff;
        }
    }
    printf ("%d\n", maxdiff);
    return 0;
}



 

#include <stdio.h>
#include <stdlib.h>

int main() {
    int n = 6;
    int array[] = {1, 2, 8, 4, 5, 6};
    int diff=0, i;

    for(i = 0; i < n-1; i++) 
       diff = ( abs(array[i] - array[i+1]) > diff)? abs(array[i] - array[i+1]): diff;
    printf("%d", diff);
    return 0;
}


