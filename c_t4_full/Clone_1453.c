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

int main() {
	  char ch;
	  int countChar = 0;
	  int countFragments = 0;
	  int startFragment = 0;
	  while ((ch = getchar()) != EOF) {
	    if (!isspace(ch)) {
	      countChar++;
	      if (startFragment == 0) countFragments++;
	      startFragment = 1;
	    } else {
	      startFragment = 0;
	    }
	  }
	  printf("%d fragments read, %d characters in total\n", countFragments, countChar);
	  return EXIT_SUCCESS;
}


