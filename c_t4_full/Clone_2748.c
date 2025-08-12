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

int main () {
    int tab[] = {1, 2, 8, 4, 5, 6};
    int maxdiff = 0, i;

    for(i = 1; i < sizeof(tab)/sizeof(tab[0]); ++i)
        if((tab[i] - tab[i - 1]) > maxdiff) maxdiff = tab[i] - tab[i - 1];

    printf ("%d\n", maxdiff);
    return 0;
}


