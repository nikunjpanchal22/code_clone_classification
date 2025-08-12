int main () {
    int n, i, b;
    printf ("Enter number of rows: ");
    scanf ("%d", & n);
    for (i = 1; i <= n; i++) {
        if (i < (n / 2) + 1) {
            for (b = i; b < n / 2 + 1; b++) {
                printf (" ");
            }
        }
        else {
            for (b = i; b != (n / 2) + 1; b--) {
                printf (" ");
            }
        }
        for (b = 1; b <= n + 1; b++) {
            printf ("*");
        }
        printf ("\n");
    }
    return 0;
}




int main () {
    int n, i, b;
    printf ("Enter number of rows: ");
    scanf ("%d", & n);
    for (i = 1; i <= n; i++) {
        if (i < (n / 2) + 1) {
            for (b = i; b < n / 2 + 1; b++) {
                printf ("\u2592");
            }
        }
        else {
            for (b = i; b != (n / 2) + 1; b--) {
                printf ("\u2592");
            }
        }
        for (b = 1; b <= n + 1; b++) {
            printf ("*");
        }
        printf ("\n");
    }
    return 0;
}
