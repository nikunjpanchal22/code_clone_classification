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
    while (j) {
        j = (i <= 5);
        i = i + 1;
        printf ("%d  %d", i, j);
        if (j == 0) {
            break;
        }
    }
    return 0;
}


