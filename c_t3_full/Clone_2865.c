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
    int n = 6, i;
    int tab [] = {1, 2, 8, 4, 5, 6};
    int maxdiff = 0;

    for (i = 0; i < n - 1; i++) {
        int diff = abs(tab[i + 1] - tab[i]);
        maxdiff = (maxdiff<diff) ? diff : maxdiff;
    }
    printf("%d\n", maxdiff);
    return 0;
}


