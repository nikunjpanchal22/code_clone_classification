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






#include <ctype.h>
#include <stdio.h>
#include <stdlib.h>

#define NEWLINE '\n'

int main() {
	  int characters = 0, fragments = 0, in_fragment = 0;
	  char c;

	  while ((c = getchar()) != EOF) {
	    if (!isspace(c)) {
	      characters++;
	      if (in_fragment == 0){
		 fragments++;
	      } 
	      in_fragment = 1;
	    } else {
	      in_fragment = 0;
	    }
	  }
	  printf("%d fragments read, %d characters in total\n", fragments, characters);
	  return EXIT_SUCCESS;
}


