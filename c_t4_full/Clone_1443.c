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
    int arr4[3][3] = {{28, 29, 30}, {31, 32, 33}, {34, 35, 36}};
    for(int i=0; i<3; i++)
        printf("%d ", arr4[2][i]);
    printf("\n");
    for(int i=0; i<3; i++)
        printf("%d ", arr4[1][i]);
    return 0;
}


