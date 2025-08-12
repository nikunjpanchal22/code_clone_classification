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
    char *ptr;
    int num_var;
    printf ("Enter a number please: ");
    scanf ("%d", &num_var);
    ptr = (char *) malloc (num_var * sizeof(char));
    printf ("Your number is: %d\n", num_var);
    for (int p = 0; p < num_var; p++) {
        printf ("Enter letters: ");
        while ((getchar()) != '\n');
        scanf ("%c", ptr + p);
    }
    printf ("Your letters are: ");
    for (int p = 0; p < num_var; p++) {
        printf ("%c ", ptr[p]);
    }
    free(ptr);
    return 0;
}


