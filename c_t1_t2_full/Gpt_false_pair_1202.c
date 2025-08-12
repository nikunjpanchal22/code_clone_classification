int main () {
    int a [] = {10, 2, 6, 3, 5, 9, 8, 4, 7};
    int l = sizeof a / sizeof a[0];
    int i, j;
    int check = 1;
    for (i = 0; i < l; i++) {
        check = 1;
        for (j = i + 1; j < l; j++) {
            if (a[i] >= a[j]) {
                check = 0;
            }
        }
        if (check)
            printf ("%d", a[i]);
    }
    printf ("\n");
    return 0;
}




int main () {
    int a [] = {10, 2, 6, 3, 5, 9, 8, 4, 7};
    int l = sizeof a / sizeof a[0];
    int i, j;

    for (i = 0; i < l; i++) {
        int check = 0;
        for (j = 0; j < l; j++) {
            if (j != i && a[i] < a[j]) {
                check = 1;
            }
        }
        if (check)
            printf ("%d\t", a[i]);
    }
    printf ("\n");
    return 0;
}
