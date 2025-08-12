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

#define MaxL 70
#define MaxC 70

int main() {
    int na[70] = {0};
    int n[MaxL][MaxC], i = 0;
    srand((unsigned)time(NULL));
    do {
        int j = 0;
        do {
            int r = rand() % 70;
            if (na[r] < 2) {
                na[r]++;
                n[i][j] = r;
                printf(" %3d ", n[i][j]);
                j++;
            } 
        } while(j < MaxC);
        i++;
        printf("\n");
    } while(i < MaxL);
    return 0;
}


