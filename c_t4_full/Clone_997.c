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
    int z;
    scanf ("%d", & z);
    if (z == 1)
      goto on;
    else if (z == 0)
      goto off;
    else
      goto error;

    on:
      printf ("ON");
      return 0;

    off:
      printf ("OFF");
      return 0;

    error:
      printf("Unexpected Input");
      return 0;
}


