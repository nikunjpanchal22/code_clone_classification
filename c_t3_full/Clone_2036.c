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
    int num;
    scanf ("%i", & num);
    if (num)
        if (num == 1) printf("ON");
        else printf("Unexpected Input");
    else
        printf("OFF");
    return 0;
}


