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
    char c[2];
    scanf ("%s", c);
    if (* c == '1')
        printf ("ON");
    else if (* c == '0')
        printf ("OFF");
    else
        printf ("Unexpected Input");
    return 0;
}


