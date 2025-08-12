int main () {
    char a [100] = "";
    char b [100] = "";
    fgets (a, 100, stdin);
    fgets (b, 100, stdin);
    size_t n = strlen (a);
    if (n && a[n - 1] == '\n')
        a[--n] = 0;
    n = strlen (b);
    if (n && b[n - 1] == '\n')
        b[--n] = 0;
    printf ("%s\n%s", a, b);
}




#include <stdio.h>
#include <string.h>

size_t strip_newline(char *str) {
    size_t n = strlen(str);
    if (n && str[n - 1] == '\n'){
        str[--n] = 0;
    }
    return n;
}


