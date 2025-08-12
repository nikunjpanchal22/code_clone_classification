int main () {
    unsigned int c;
    unsigned char *cptr = (unsigned char *) &c;
    while (1) {
        scanf ("%d", & c);
        printf ("Signed value: %d\n", c);
        printf ("Unsigned value: %u\n", c);
        printf ("%u.%u.%u.%u \n", * cptr, * (cptr + 1), * (cptr + 2), * (cptr + 3));
    }
}




#include <stdio.h>
int main () {
      union {
          unsigned int c;
          unsigned char cbyte[4];
      } u;
      while (1) {
          scanf ("%d", & u.c);
          printf ("Signed value: %d\n", u.c);
          printf ("Unsigned value: %u\n", u.c);
          printf ("%u.%u.%u.%u \n", u.cbyte[0], u.cbyte[1], u.cbyte[2], u.cbyte[3]);
      }
}


