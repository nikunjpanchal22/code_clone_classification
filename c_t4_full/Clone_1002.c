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
    if(scanf ("%d", & x) != 1)
        printf ("Unexpected Input");
    else
        printf (x == 1 ? "ON" : (x == 0 ? "OFF" : "Unexpected Input"));
    return 0;
}


