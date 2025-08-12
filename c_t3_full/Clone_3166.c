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

int main(){
    char a[100], b[100];
    fgets(a, 100, stdin);
    fgets(b, 100, stdin);
    size_t len = strlen(a);
    if (a[len-1] == '\n') { a[len-1] = '\0'; }
    len = strlen(b);
    if (b[len-1] == '\n') { b[len-1] = '\0'; }
    printf("%s\n%s\n", a, b);
    return 0;
}


