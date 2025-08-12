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
    scanf ("%d %d", &width, &breadth);
    if (width == 1 && breadth == 1) {
        printf ("#\n");
    }
    else {
        int i = 0;
        while(i < breadth) {
            int j = 0;
            while(j < width) {
                if((i%breadth==0)||(j%width==0)||((i+1)%breadth==0)||((j+1)%width==0))
                    printf("#");
                else
                    printf(".");
                j++;
            }
            printf("\n");
            i++;
        }
    }
    return 0;
}


