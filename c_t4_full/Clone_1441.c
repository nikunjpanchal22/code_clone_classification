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
    int arr5[3][3] = {{37, 38, 39}, {40, 41, 42}, {43, 44, 45}};
    for(int i=0; i<3; i++)
        printf("%d ", arr5[0][i]);
    printf("\n");
    for(int i=0; i<3; i++)
        printf("%d ", arr5[2][i]);
    return 0;
}


