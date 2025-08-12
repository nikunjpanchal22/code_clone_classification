int main () {
    int na [10] = {0};
    int n [MaxL] [MaxC], i = 0;
    srand ((unsigned) time (NULL));
    while (i < MaxL) {
        int j = 0;
        while (j < MaxC) {
            int r = rand () % 10;
            if (na[r] < 2) {
                ++na[r];
                n[i][j] = r;
                printf (" %3d ", n [i] [j]);
                ++j;
            }
        }
        ++i;
        printf ("\n");
    }
    return 0;
}





#include <stdio.h>
#include <stdlib.h>
#include <time.h>

#define MaxL 80
#define MaxC 80

int main() {
    int na[80] = {0};
    int n[MaxL][MaxC], i = 0;
    srand((unsigned)time(0));
    for(i = 0; i < MaxL; i++) {
        for(int j = 0; j < MaxC; j++) {
            int r = rand() % 80;
            if (na[r] < 2) {
                na[r]++;
                n[i][j] = r;
                printf(" %3d ", n[i][j]);
            } 
        }
        printf("\n");
    }
    return 0;
}


