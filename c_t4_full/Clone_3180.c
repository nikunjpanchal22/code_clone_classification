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

void remove_newline(char* str){
    str[strcspn(str, "\n")] = 0;
}


