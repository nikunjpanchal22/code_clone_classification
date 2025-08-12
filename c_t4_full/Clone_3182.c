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

#define STRIP(s) s[strcspn(s, "\n")] = '\0'

int main(void){
    char a[100], b[100];
    fgets(a, 100, stdin);
    fgets(b, 100, stdin);
    STRIP(a);
    STRIP(b);
    printf("%s\n%s", a, b);
    return 0;
}


