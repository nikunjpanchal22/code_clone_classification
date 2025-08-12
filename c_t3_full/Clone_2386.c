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
void main(){
    int a, b;
    int array[5][5] = {{1, 2, 3, 4, 5}, {1, 2, 3, 4, 5}};
    printf ("Sizeof(arr) : %zu\n", sizeof(array));
    printf ("Sizeof(arr[0]) : %zu\n", sizeof(array[0]));
    for(a = 0; a < sizeof(array) / sizeof(array[0]); a++){
        for(b = 0; b < sizeof(array[0]) / sizeof(array[a][a]); b++)
            array[a][b] += 1;
    }
    for(a = 0; a < sizeof(array) / sizeof(array[0]); a++){
        for(b = 0; b < sizeof(array[a]) / sizeof(array[0][a]); b++)
            printf ("%d ", array[a][b]);
        printf("\n");
    }
}


