int main () {
    int n;
    char str [100] [100];
    scanf ("%d\n", & n);
    for (int i = 0; i < n; i++) {
        scanf ("%s", str [i]);
    }
    for (int i = 0; i < n; i++)
        printf ("%s\n", str[i]);
    getchar ();
    return 0;
}






int main () {
    int i, n;
    char str [100][100];
    scanf ("%d", &n);
    for (i = 0; i < n; i++) scanf ("%s", str[i]);
    for (i = 0; i < n; i++) printf ("%s\n", str[i]);
    getchar();
    return 0;
}


