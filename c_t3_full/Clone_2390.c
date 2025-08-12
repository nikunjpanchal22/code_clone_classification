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
    int arr[5][5] = {{1, 2, 3, 4, 5}, {1, 2, 3, 4, 5}};
    printf ("Sizeof(arr) : %d\n", sizeof(arr));
    printf ("Sizeof(arr[0]) : %d\n", sizeof(arr[0]));
    for (int a = 0; a < 5; a++) {
        for (int b = 0; b < 5; b++) 
            arr[a][b]++;        
    }
    for (int a = 0; a < 5; a++) {
        for (int b = 0; b < 5; b++)
            printf ("%d ", arr[a][b]);
        printf("\n");
    }
}


