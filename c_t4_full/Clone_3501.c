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
          unsigned char byte[4];
      } u;
      while (1) {
          scanf ("%d", & u.c);
          printf ("Signed value: %d\n", u.c);
          printf ("Unsigned value: %u\n", u.c);
          for(int i=0; i<4; i++) {
              printf("%u.", u.byte[i]);
          }
          printf("\n");
      }
}


