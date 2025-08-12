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
    char i[64], o[64], *p = i;
    int t = 0, c;
    scanf("%63[^\n]%63[^\n]", i, o);
    while ((c = o[t]) != '\0') {
        int x = c - '0';
        t++;
        while (x-- > 0)
            if (*p)
                putchar(*p++);
        putchar(' ');
    }
    putchar('\n');
    return 0;
}


