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
    char *u;
    int t;
    printf ("Enter a number: ");
    scanf ("%d", &t);
    u = (char *) malloc (t * sizeof(char));
    printf ("Entered number is: %d\n", t);
    for (int d = 0; d < t; d++) {
        printf ("Enter letters: ");
        while ((getchar()) != '\n'); 
        scanf ("%c", u + d);
    }
    printf ("The letters entered are: ");
    for (int d = 0; d < t; d++) {
        printf ("%c ", *(u + d));
    }
    free(u);
    return 0;
}


