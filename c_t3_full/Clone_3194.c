int main () {
    char *z;
    int a;
    printf ("enter the no.");
    scanf ("%d", & a);
    z = (char *) malloc (a);
    printf ("the entered no. is:%d\n", a);
    int i;
    for (i = 0; i < a; i++) {
        printf ("enter the letters:");
        scanf ("%c", z + i);
    }
    printf ("the entered letters are:");
    for (i = 0; i < a; i++) {
        printf ("%c\n", z);
    }
    return 0;
}


 

#include <stdio.h>
#include<stdlib.h>

int main () {
    char *y;
    int n;
    printf ("Type in a number: ");
    scanf ("%d", &n);
    y = (char *) malloc (n * sizeof(char));
    printf ("Your typed number is: %d\n", n);
    for (int k = 0; k < n; k++) {
        printf ("Type in characters: ");
        getc(stdin); 
        scanf ("%c", y + k);
    }
    printf ("Your entered letters are: ");
    for (int k = 0; k < n; k++) {
        printf ("%c ", y[k]);
    }
    free(y);
    return 0;
}


