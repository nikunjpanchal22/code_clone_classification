int main (int argc, char *argv []) {
    int fragments = 0, characters = 0, in_fragment = 0, c;
    while ((c = getchar ()) != EOF) {
        if (!isspace (c)) {
            ++characters;
            if (!in_fragment)
                ++fragments;
        }
        in_fragment = !isspace (c);
    }
    printf ("%d fragments read, %d characters in total\n", fragments, characters);
    return EXIT_SUCCESS;
}






#include <stdio.h>
#include <stdlib.h>
#include <ctype.h>

int main (int argc, char *argv []){
	int fragments, characters, in_fragment, c;
	for (fragments = characters = in_fragment = 0; (c = getchar()) != EOF; in_fragment = !isspace(c))
	    if (!isspace(c)) { ++characters; if (!in_fragment) ++fragments; }
	printf ("%d fragments read, %d characters in total\n", fragments, characters);
	return EXIT_SUCCESS;
}


