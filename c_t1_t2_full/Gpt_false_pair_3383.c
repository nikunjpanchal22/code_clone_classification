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
    char a [100] = "";
    char b [100] = "";
    fgets (a, 100, stdin);
    fgets (b, 100, stdin);
    size_t x = strlen (a);
    if (x && a[x - 1] == '\n')
        a[--x] = 0;
    x = strlen (b);
    if (x && b[x - 1] == '\n')
        b[--x] = 0;
    printf ("%s\n%s", a, b);
}
