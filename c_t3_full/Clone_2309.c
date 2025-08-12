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





#include <cstdio>
main() {
  int c;
  while ((c = getchar()) != EOF) {
	    if (c == ' ') {
	      putc(c, stdout);
	      while ((c = fgetc(stdin)) == ' ') {}
	    }
	    if (c != ' ')
	      putchar(c);
	  }
}


