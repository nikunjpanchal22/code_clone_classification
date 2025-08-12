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
    int* arr = (int*) malloc(n * sizeof(int));
    arr[0] = 1, arr[1] = 2, arr[2] = 8, arr[3] = 4, arr[4] = 5, arr[5] = 6;
    int mxdiff = 0;
    for(int i = 0; i < n - 1; i++) {
        if (abs(arr[i + 1] - arr[i]) > mxdiff)
            mxdiff = abs(arr[i + 1] - arr[i]);
    }
    printf("%d", mxdiff);
    return 0;
}


