int main () {
    int n;
    char c;
    printf ("Enter a number: ");
    if (2 != scanf ("%d%c", &n, &c)) {
        printf ("Invalid number input\n");
        return 1;
    }
    if (c != '\n') {
        printf ("Invalid number input\n");
        return 1;
    }
    if (n < 1 || n > 30) {
        printf ("Valid range is 1..30\n");
        return 1;
    }
    printf ("You entered %d\n", n);
    return 0;
}


int main () {
    int n;
    char c;
    printf ("Enter a number: ");
    if (2 != scanf ("%d%c", &n, &c)) {
        printf ("Invalid number input\n");
        return 1;
    }
    if (c == '\n') {
        if (n < 1 || n > 30) {
            printf ("Valid range is 1..30\n");
            return 1;
        }
        printf ("You entered %d\n", n);
        return 0;
    }
    else {
        printf ("Invalid number input\n");
        return 1;
    }
}
