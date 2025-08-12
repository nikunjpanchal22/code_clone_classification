int main () {
    const char *s = "/products/product_code1233213/image.jpg";
    const char *p = s, *begin = s, *end = s;
    char *result;
    size_t len;
    while (p) {
        p = strchr (p, '/');
        if (p) {
            begin = end;
            end = ++p;
        }
    }
    if (begin != end) {
        len = end - begin - 1;
        result = malloc (len +1);
        memcpy (result, begin, len);
        result[len] = '\0';
        printf ("%s\n", result);
        free (result);
    }
    return 0;
}



#include <stdio.h>
#include <string.h>
#include <stdlib.h>

int main() {
    char s[] = "/products/product_code1233213/image.jpg";
	char *res;
	char *tok = NULL;
    for(tok = strtok(s, "/"); tok; tok = strtok(NULL, "/")) {
        res = tok;
    	}
    printf("%s\n", res);
    return 0;
}


