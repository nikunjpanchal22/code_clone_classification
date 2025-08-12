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
#include <stdlib.h>
#include <string.h>

int main() {
    const char *s = "/products/product_code1233213/image.jpg";
    char* token, *last_token = NULL;
    token = strtok(s, "/");
    while (token != NULL)
    {
        last_token = token;
        token = strtok(NULL, "/");
    }
    printf("%s",last_token);
    return 0;
}


