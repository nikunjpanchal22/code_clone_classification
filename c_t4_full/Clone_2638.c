int main () {
    int width;
    int breadth;
    scanf ("%d", & width);
    scanf ("%d", & breadth);
    if (width == 1 && breadth == 1) {
        printf ("#\n");
    }
    else {
        for (int i = 0; i < breadth; i++) {
            for (int j = 0; j < width; j++) {
                if (i == 0 || j == 0)
                    printf ("#");
                else if (i == (breadth - 1) || j == (width - 1))
                    printf ("#");
                else
                    printf (".");
            }
            printf ("\n");
        }
    }
    return 0;
}





#include <stdio.h>

int main () {
    int width, breadth;
    scanf ("%d%d", &width, &breadth);
    char pattern[2] = {'.','#'};
    if (width == 1 && breadth == 1)
        printf ("#\n");
    else {
        for (int i = 0; i < breadth; i++) {
            for (int j = 0; j < width; j++)
                printf ("%c", pattern[!(i && j && i != (breadth - 1) && j != (width - 1))]);
            printf ("\n");
        }
    }
    return 0;
}


