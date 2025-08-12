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
    if (!x)
        printf("OFF");
    else
        printf (x == 1 ? "ON" : "Unexpected Input");
    return 0;
}


