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
      unsigned int c;    
      while (1) {
          scanf ("%u", & c);
          printf ("Signed value: %d\n", c);
          printf ("Unsigned value: %u\n", c);
          for (int i=0;i<4;i++){
              printf ("%u.", ((unsigned char*)&c)[i]);
          }
          printf ("\n");
      }
}


