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


 int main() {
    int n = 100;
    char a[n], b[n];
    fgets(a, n, stdin);
    fgets(b, n, stdin);
    size_t l = strlen(a);
    if(l && a[l-1] == '\n')
        a[--l] = 0;
    l = strlen(b);
    if(l && b[l-1] == '\n')
        b[--l] = 0;
    printf("%s\n%s", a, b);
}


