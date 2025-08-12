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
    char buf[100];
    char a[100] = "";
    char b[100] = "";
    fgets(buf, 100, stdin);
    strncpy(a, buf, 100);
    buf[strcspn(buf, "\n")] = 0;
    fgets(buf, 100, stdin);
    strncpy(b, buf, 100);
    buf[strcspn(buf, "\n")] = 0;
    printf("%s\n%s", a, b);
}


