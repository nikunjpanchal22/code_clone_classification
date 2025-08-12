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
    char *w;
    int p;
    printf ("Enter a number: ");
    scanf ("%d", &p);
    w = (char *) malloc (p * sizeof(char));
    printf ("Your number is: %d\n", p);
    int q;
    for (q = 0; q < p; q++) {
        printf ("Enter letters: ");
        while ((getchar()) != '\n'); 
        scanf ("%c", w + q);
    }
    printf ("Your letters are: ");
    for (q = 0; q < p; q++) {
        printf ("%c ", *(w + q));
    }
    free(w);
    return 0;
}


