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

#define N 6

int main() {
    int tab[N] = {1, 2, 8, 4, 5, 6};
    int dif = 0;

    for(int i = N-1; i > 0; i--)
       dif = abs(tab[i] - tab[i-1]) > dif ? abs(tab[i] - tab[i-1]) : dif;

    printf("%d", dif);
    return 0;
}


