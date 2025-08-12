int main (void) {
    int x;
    scanf ("%d", & x);
    if (x == 1)
        printf ("ON");
    else if (x == 0)
        printf ("OFF");
    else
        printf ("Unexpected Input");
}





#include <stdio.h>

int main () {
    int x;
    scanf ("%d", & x);
    char *msg[] = {"OFF", "ON", "Unexpected Input"};
    printf ("%s", (x == 0 || x == 1) ? msg[x] : msg[2]);
    return 0;
}


