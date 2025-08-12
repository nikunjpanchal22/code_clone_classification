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






#include <stdio.h>
#include <string.h>

int main() {
	  char a[] = "Japan Korea Spain Germany Australia France ";
	  char b[] = "England USA Russia Italy Australia India Nepal France";
	  char *s1 = strtok(a, " ");
	  char *s2;
	  while (s1) {
	    if ((s2 = strstr(b, s1)) && (s2 == b || *(s2 - 1) == ' ')) {
	      size_t len_s1 = strlen(s1);
	      if (*(s2 + len_s1) == ' ' || *(s2 + len_s1) == '\0') {
		puts(s1);
	      }
	    }
	    s1 = strtok(NULL, " ");
	  }
	  return 0;
}


