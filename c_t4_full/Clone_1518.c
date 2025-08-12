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
    while ( (c = fgetc(stdin)) != EOF) {
		if (c == ' ') {
		    fputc(c, stdout);
		    while ((c = fgetc(stdin)) == ' ') {}
		}
		if (c != EOF && c != ' ') {
		    fputc(c, stdout);
		}
	    }
	    return 0;
}


