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




#include<stdio.h>
#include<string.h>
#include<stdlib.h>

int main() {
    char s[] = "/products/product_code1233213/image.jpg";
    char *start, *end;
    start = end = s;
    while (*end) {
        start = end;
        end++;
        while (*end && *end != '/')
            end++;
    }
    char buffer[255];
    strncpy(buffer, start, end - start);
    buffer[end - start] = '\0';
    puts(buffer);
    return 0;
}


