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
    char *z;
    int a;
    printf ("Enter a number\n");
    scanf ("%d", &a);
    z = (char *) calloc(a,sizeof(char));
    printf ("Your entered number is: %d\n", a);
    for (int i = 0; i < a; i++) {
        printf ("Enter characters:");
        while ((getchar()) != '\n'); 
        scanf ("%c", &z[i]);
    }
    printf ("Your entered letters are:");
    for (int i = 0; i < a; i++) {
        printf ("%c ", z[i]);
    }
    free(z);
    return 0;
}


