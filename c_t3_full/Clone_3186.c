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
    char *x;
    int m;
    printf ("Enter a number: ");
    scanf ("%d", &m);
    x = (char *) malloc (m * sizeof *x);
    printf ("Entered number is: %d\n", m);
    int l;
    for (l = 0; l < m; l++) {
        printf ("Enter letters:");
        while ((getchar()) != '\n'); 
        scanf ("%c", x + l);
    }
    printf ("Your letters are ");
    for (l = 0; l < m; l++) {
        printf ("%c ", *(x + l));
    }
    free(x);
    return 0;
}


