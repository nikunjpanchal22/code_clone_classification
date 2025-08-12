int main () {
    int *sdimen, i;
    sdimen = malloc (10 * sizeof (int));
    sdimen[0] = 10;
    sdimen[1] = 20;
    printf ("\n.. %d... %d ", sdimen [0], sdimen [1]);
    int **twodimen;
    twodimen = malloc (sizeof (int *) * 10);
    for (i = 0; i < 10; i++) {
        twodimen[i] = malloc (sizeof (int) * 5);
    }
    twodimen[0][0] = 10;
    twodimen[0][3] = 30;
    twodimen[2][3] = 50;
    printf ("\n %d ... %d.... %d ", twodimen [0] [0], twodimen [0] [3], twodimen [2] [3]);
    return 0;
}





#include <stdio.h>
#include <stdlib.h>

int main () {
    int *p, index;
    p = malloc(10 * sizeof(int));
    p[0] = 1;
    p[1] = 2;
    printf("\n.. %d... %d ", p[0], p[1]);

    int **p2d;
    p2d = malloc(10 * sizeof(int*));
    for(index = 0; index < 10; index++){
        p2d[index] = malloc(5 * sizeof(int));
    }
    p2d[0][0] = 3;
    p2d[0][3] = 6;
    p2d[2][3] = 9;
    printf("\n %d ... %d.... %d ", p2d[0][0], p2d[0][3], p2d[2][3]);
    free(p);
    for(index = 0; index < 10; index++)
        free(p2d[index]);
    free(p2d);
    return 0;
}


