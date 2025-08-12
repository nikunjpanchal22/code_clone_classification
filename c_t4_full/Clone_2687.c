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
    int width, length;
    scanf("%d %d", &width, &length);
    width == 1 && length == 1 ? printf("#\n")
        : printf("%.*s\n", width, "########################");
    for(length -= 2; length--; )
        printf("#%.*s#\n", width-2, "........................");
    width > 1 && !length ? printf("%.*s\n", width, "#######################") : 0;
    return 0;
}


