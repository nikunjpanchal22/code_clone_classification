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
    int i = 1, j = 1;
    do {
        j = (i <= 5);
        printf ("%d  %d", i, j);
        i++;
    } while (j == 1);
    return 0;
}


