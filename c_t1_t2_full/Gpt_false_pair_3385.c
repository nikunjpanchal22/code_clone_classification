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


int main () {
    char c [100] = "";
    char d [100] = "";
    fgets (c, 100, stdin);
    fgets (d, 100, stdin);
    size_t y = strlen (c);
    if (y && c[y - 1] == '\n')
        c[--y] = 0;
    y = strlen (d);
    if (y && d[y - 1] == '\n')
        d[--y] = 0;
    printf ("%s\n%s", c, d);
}
