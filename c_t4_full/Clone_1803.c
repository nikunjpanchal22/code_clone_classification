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

int main () {
	    char countries1[] = "Japan Korea Spain Germany Australia France ";
	    char countries2[] = "England USA Russia Italy Australia India Nepal France";
	    char *country;
	    char *found;
	    size_t len;

	    for (country = strtok(countries1, " "); country; country = strtok(NULL, " ")) {
		if ((found = strstr(countries2, country)) && (found == countries2 || *(found - 1) == ' ') &&
		    ((*(found + (len = strlen(country))) == ' ') || (*(found + len) == '\0'))) {
		    puts(country);
		}
	    }
	    return 0;
}


