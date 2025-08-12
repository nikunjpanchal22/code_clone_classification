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
    int n;
    scanf ("%d", &n);
    switch (n) {
        case 0: 
           printf ("OFF");
           break;
        case 1: 
           printf ("ON");
           break;
        default: 
           printf ("Unexpected Input");
    }
    return 0;
}


