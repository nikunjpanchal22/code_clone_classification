int main () {
    int width;
    int breadth;
    scanf ("%d %d", & width, & breadth);
    if (width == 1 && breadth == 1)
        printf ("#\n");
    else {
        for (int i = 0; i < breadth; i++) {
            for (int j = 0; j < width; j++)
                if (j == 0 || j == width - 1 || i == 0 || i == breadth - 1)
                    printf ("#");
                else
                    printf (".");
            printf ("\n");
        }
    }
    return 0;
}





#include <stdio.h>
#define MAX 1024
int main () {
    char matrix[MAX][MAX];
    int width, height;
    scanf ("%d %d", &width, &height);
    if (width == 1 && height == 1)
        printf ("#\n");
    else {
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++)
                if (j == 0 || j == width - 1 || i == 0 || i == height - 1)
                    matrix[i][j] = '#';
                else
                    matrix[i][j] = '.';
            matrix[i][width] = '\0';
            printf ("%s\n", matrix[i]);
        }
    }
    return 0;
}


