int main (void) {
    int i = 1, j = 1;
    while (j != 0) {
        j = (i <= 5);
        i = i + 1;
        printf ("%d  %d", i, j);
    }
    return 0;
}


 int main (void) {
    int i = 0, j = 1;
    while (j != false) {
        j = (i <= 5);
        i = i + 1;
        printf ("%d  %d", i, j);
    }
    return 0;
}
