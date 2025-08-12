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
  while ((c = getc(stdin)) != EOF) {
	    if (c == ' ') {
	      putc(c, stdout);
	      while ((c = getc(stdin)) == ' ') {}
	    }
	    if (c != EOF && c != ' ') {
		putc(c, stdout);
	    }
	  }
}


