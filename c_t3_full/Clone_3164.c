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
    int *arr, i;

    arr = (int*)calloc(10, sizeof(int));
    arr[0] = 15;
    arr[2] = 30;

    printf("...%d...%d...", arr[0], arr[2]);

    int **arr2D;
    arr2D = (int**)calloc(10, sizeof(int*));

    for(i = 0; i < 10; i++) {
        arr2D[i] = (int*)calloc(5, sizeof(int));
    }

    arr2D[1][1] = 20;
    arr2D[1][4] = 40;
    arr2D[3][4] = 60;

    printf("\n %d ... %d.... %d ", arr2D [1][1], arr2D [1][4], arr2D [3][4]);

    free(arr);
    for(i = 0; i < 10; i++)
        free(arr2D[i]);
    free(arr2D);

    return 0;
}


