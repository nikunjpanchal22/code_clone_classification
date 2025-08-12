int main (void) {
    int number;
    printf ("Enter an integer: ");
    if (scanf ("%d", &number) == 1) {
        printf ("You entered: %d\n", number);
    }
    else {
        puts ("Invalid input");
    }
    return 0;
}





#include <stdio.h>

int main () {
    int num;
    printf ("Enter an integer: ");
    fscanf (stdin, "%d", &num) == 1 ? printf ("You entered: %d\n", num) : puts ("Invalid input");
    return 0;
}


