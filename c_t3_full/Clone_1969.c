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


 int main (void) {
    char n [64];
    char m [64];
    char *p = n;
    int c;
    scanf ("%63[0-9] %63[0-9]", n, m);
    for (int i = 0; m[i] != '\0'; i++) {
        if (isdigit(m[i])) {
            c = m[i] - '0';
            for (int j = 0; j < c; j++)
                if (*p)
                    putchar (*p++);
            putchar (' ');
        }
    }
    putchar ('\n');
    return 0;
}


