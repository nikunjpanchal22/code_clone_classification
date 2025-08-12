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
int main() {
    int width, height;
    scanf("%d %d", &width, &height);
    (width == 1 && height == 1)? printf("1"): printf("%.*s\n", width, "*******************");
    for(--height; height > 1; --height) printf("#%*.*s#\n", width-2, width-2, ".................");
    if(width > 1 && height == 1) printf("%.*s\n", width, "**************");
    return 0;
}


