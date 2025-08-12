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
    int c;
    while (((c = getc(stdin)) != EOF) && c != '\0') {
		if (c == ' ') {
		    putc(c, stdout);
		    while ((c = getc(stdin)) == ' ') {}
		}
		if (c != ' ')
		    putc(c, stdout);
	    }
	    return 0;
}


