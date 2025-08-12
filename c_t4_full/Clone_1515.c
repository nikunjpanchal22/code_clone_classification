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
int main() {
    char c;
    do {
	    c = getc(stdin);
	    if (c == ' ') {
	      putc(c, stdout);
	      do {
		  c = getc(stdin);
	      } while (c == ' ');
	    }
	    if (c != ' ' && c != EOF)
	      putc(c, stdout);
	    } while (c != EOF);
	    return 0;
}


