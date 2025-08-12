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
    int array[6] = {1, 2, 8, 4, 5, 6};
    int diff = abs(array[1] - array[0]);
    int i = 2;
    while (i < n) {
        diff = abs(array[i] - array[i-1]) > diff ? abs(array[i] - array[i-1]) : diff;
        i++;
    }
    printf("%d", diff);
    return 0;
}


