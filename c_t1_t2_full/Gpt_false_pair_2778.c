int main (void) {
    char line [128], *p = line;
    int sum = 0, len, n;
    printf ("enter numbers: ");
    scanf ("%127[^\n]", line);
    while (sscanf (p, "%d%n", &n, &len) == 1) {
        sum += n;
        p += len;
    }
    printf ("sum: %d\n", sum);
    return 0;
}


int main (void) {
    char line [128], *p = line;
    int total = 0, len, n;
    printf ("enter numbers: ");
    scanf ("%127[^\r\n]", line);
    while (sscanf (p, "%d%n", &n, &len) == 1) {
        total += n;
        p += len;
    }
    printf ("sum: %d\n", total);
    return 0;
}
