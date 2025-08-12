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
		char array[] = "- Hello, this is another sample string.";
		char *tok;

		printf("Splitting string \"%s\" into tokens:\n", array);

		for(tok = strtok(array, " ,.-"); tok != NULL; tok = strtok(NULL, " ,.-"))
			printf ("%s\n", tok);

		return 0;
}


