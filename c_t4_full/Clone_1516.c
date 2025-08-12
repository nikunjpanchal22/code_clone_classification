main () {
    int c;
    while ((c = getchar ()) != EOF) {
        if (c == ' ') {
            putchar (c);
            while ((c = getchar ()) == ' ')
                ;
        }
        if (c != ' ')
            putchar (c);
    }
}





#include <stdio.h>
void main() {
  char c;
  do {
	    c = getchar();
	    if (c == ' ') {
	      printf("%c", c);
	      while ((c = getchar()) == ' ') {}
	    }
	    if (c != ' ')
	      printf("%c", c);
	  } while (c != EOF);
}


