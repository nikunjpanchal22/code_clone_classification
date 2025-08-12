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
    char *v;
    int r;
    printf ("Please enter a number: ");
    scanf ("%d", &r);
    v = (char *) malloc (r * sizeof(char));
    printf ("Your number is: %d\n", r);
    for (int s = 0; s < r; s++) {
        printf ("Enter letters: ");
        while ((getchar()) != '\n');
        scanf ("%c", &v[s]);
    }
    printf ("Your letters are: ");
    for (int s = 0; s < r; s++) {
        printf ("%c ", v[s]);
    }
    free(v);
    return 0;
}


