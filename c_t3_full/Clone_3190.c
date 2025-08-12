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
    char *var;
    int num;
    printf ("Please, enter your number: ");
    scanf ("%d", &num);
    var = (char *) malloc (num * sizeof(char));
    printf ("Your number is: %d\n", num);
    for (int o = 0; o < num; o++) {
        printf ("Please enter letters: ");
        while ((getchar()) != '\n');
        scanf ("%c", &var[o]);
    }
    printf ("Your letters are: ");
    for (int o = 0; o < num; o++) {
        printf ("%c ", var[o]);
    }
    free(var);
    return 0;
}


