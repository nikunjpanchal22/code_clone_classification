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
    int w, h;
    scanf("%d %d", &w, &h);
    (h == 1 && w == 1)? printf("1"): printf("%.*s%.*s\n", w, "########################","*********************");
    for(--h; h > 1; --h) printf("#%*.*s#%*.*s\n", w-2, w-2, "*********************",w-3,"*********************");
    if(w > 1 && h == 1) printf("%.*s%.*s\n", w, "########################","************************");
    return 0;
}


