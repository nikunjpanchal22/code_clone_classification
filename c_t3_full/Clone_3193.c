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
    char *s;
    int b;
    printf ("Type your number:");
    scanf ("%d", &b);
    s = malloc (b * sizeof *s);
    printf ("Your typed number is: %d\n", b);
    for (int j = 0; j < b; j++) {
        printf ("Input alphabets:");
        while ((getchar()) != '\n'); 
        scanf ("%c", s + j);
    }
    printf ("Your entered characters are:");
    for (int j = 0; j < b; j++) {
        printf ("%c ", *(s + j));
    }
    free(s);
    return 0;
}


