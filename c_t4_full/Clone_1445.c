int main () {
    int arr5 [] [3] = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
    for (int j = 0; j < 3; j++) {
        printf ("%d%c", * ((arr5 + 1) + j), (j == 2) ? '\n' : ' ');
    }
    for (int j = 0; j < 3; j++) {
        printf ("%d%c", * (* (arr5 + 1) + j), (j == 2) ? '\n' : ' ');
    }
    return 0;
}





#include <stdio.h>

int main() {
    int arr3[3][3] = {{19, 20, 21}, {22, 23, 24}, {25, 26, 27}};
    for(int i=0; i<3; i++)
        printf("%d ", arr3[1][i]);
    printf("\n");
    for(int i=0; i<3; i++)
        printf("%d ", arr3[0][i]);
    return 0;
}


