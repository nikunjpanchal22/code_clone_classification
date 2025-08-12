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
#define N 5
void main() {
    int i, j, arr[N][N] = {{1, 2, 3, 4, 5}, {1, 2, 3, 4, 5}};
    printf ("Sizeof(arr) : %ld\n", sizeof (arr));
    printf ("Sizeof(arr[0]) : %ld\n", sizeof (arr[0]));
    for(int a = 0; a < (sizeof (arr) / sizeof (arr[0])); a++)
        for(int b= 0; b < (sizeof (arr[0]) / sizeof(int)); b++)
            arr[a][b] += 1;
    for(int a = 0; a < (sizeof (arr) / sizeof (arr[0])); a++){
        for(int b= 0; b < (sizeof (arr[a]) / sizeof(int)); b++)
            printf ("%d ", arr[a][b]);
        printf("\n");
    }
}


