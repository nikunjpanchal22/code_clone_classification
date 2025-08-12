int main (void) {
    char str1 [] = "Japan Korea Spain Germany Australia France ";
    char str2 [] = "England USA Russia Italy Australia India Nepal France";
    char *tar = strtok (str1, " ");
    char *ptr;
    size_t sz;
    while (tar) {
        if ((ptr = strstr (str2, tar)) != NULL) {
            if ((ptr == str2) || (*(ptr - 1) == ' ')) {
                sz = strlen (tar);
                if ((*(ptr + sz) == ' ') || (*(ptr + sz) == '\0')) {
                    puts (tar);
                }
            }
        }
        tar = strtok (NULL, " ");
    }
    return 0;
}






#include <stddef.h>
#include <stdio.h>
#include <string.h>

int main() {
	  char first[] = "Japan Korea Spain Germany Australia France ";
	  char second[] = "England USA Russia Italy Australia India Nepal France";
	  char *token;
	  char *ptr;
	  size_t strSize;

	  for (token = strtok(first, " "); token != NULL; token = strtok(NULL, " ")) {
	    if ((ptr = (strstr(second, token))) && (*(ptr - 1) == ' ' || ptr == second)) {
	      strSize = strlen(token);
	      if (*(ptr + strSize) == '\0' || *(ptr + strSize) == ' ') {
		puts(token);
	      }
	    }
	  }
	  return 0;
}


