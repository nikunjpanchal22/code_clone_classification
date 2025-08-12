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

int main (){
    int i;
    scanf ("%d", & i);
    printf ("%s", i == 1 ? "ON" : i == 0 ? "OFF" : "Unexpected Input");
    return 0;
}


