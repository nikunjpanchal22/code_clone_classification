int main (void) {
    char n [64];
    char m [64];
    char *p = n;
    int i = 0;
    int c;
    scanf ("%63[0-9] %63[0-9]", n, m);
    while ((c = m[i++]) != '\0') {
        int j = c - '0';
        while (j-- > 0)
            if (*p)
                putchar (*p++);
        putchar (' ');
    }
    putchar ('\n');
    return 0;
}





#include <stdio.h>

int main(void) {
    char n[64], m[64], *scan = n;
    int i = 0, c;
    scanf("%63[0-9]%63[0-9]", n, m);
    while ( (c = m[i++]) != '\0') {
        int j = c - '0';
        while (j-- > 0)
            if (*scan)
                putchar (*scan++);
        putchar (' ');
    }
    putchar ('\n');
    return 0;
}


