void main () {
    int i, j;
    int arr [5] [5] = {{1, 2, 3, 4, 5}, {1, 2, 3, 4, 5}};
    printf ("Sizeof(arr) : %d\n", sizeof (arr));
    printf ("Sizeof(arr[0]) : %d\n", sizeof (arr [0]));
    for (int i = 0; i < (sizeof (arr) / sizeof (arr[0])); i++) {
        for (int j = 0; j < (sizeof (arr[0]) / sizeof (arr[0][0])); j++)
            arr[i][j] += 1;
    }
    for (int i = 0; i < (sizeof (arr) / sizeof (arr[0])); i++) {
        for (int j = 0; j < (sizeof (arr[i]) / sizeof (arr[0][0])); j++)
            printf ("%d ", arr[i][j]);
        printf ("\n");
    }
    printf ("\n");
}





#include <stdio.h>
#define R 5
#define C 5
void main() {
    int arr[R][C] = {{1, 2, 3, 4, 5}, {1, 2, 3, 4, 5}};
    printf ("Sizeof(arr) : %lld\n", sizeof(arr));
    printf ("Sizeof(arr[0]) : %lld\n", sizeof(arr[0]));
    for(int i=0; i<R; i++)
        for(int j=0; j<C; j++)
            arr[i][j] += 1;
    for(int i=0; i<R; i++){
        for(int j=0; j<C; j++)
            printf ("%d ",arr[i][j]);
        printf("\n");
    }
}


