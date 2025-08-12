int main () {
    char str [] = "- This, a sample string.";
    char *pch;
    printf ("Splitting string \"%s\" into tokens:\n", str);
    pch = strtok (str, " ,.-");
    while (pch != NULL) {
        printf ("%s\n", pch);
        pch = strtok (NULL, " ,.-");
    }
    return 0;
}





#include <stdio.h>
#include <string.h>

int main() {
		char line[] = "- Here's, a fancier, sample string.";
		char *seg;

		seg = strtok (line, " ,.-");
		printf ("Splitting string \"%s\" into tokens:\n", line);

		do {
			printf ("%s\n", seg);
			seg = strtok (NULL, " ,.-");
		} while(seg != NULL);

		return 0;
}


