int main () {
    int i, j, flag, rem;
    printf ("2\n");
    for (i = 3; i <= 100; i++) {
        flag = 0;
        for (j = 2; j <= i / 2; j++) {
            if (i % j == 0) {
                flag = 1;
                break;
            }
        }
        if (flag == 0)
            printf ("%d\n", i);
    }
    getch ();
    return 0;
}


 
int main () {
    int i, j, flag;
    printf ("2\n");
    for (i = 3; i <= 100; i++) {
        flag = 0;
        for (j = 2; j <= (int) sqrt(i); j++) {
            if (i % j == 0 && j != i) {
                flag = 1;
                break;
            }
        }
        if (flag == 0)
            printf ("%d\n", i);
    }
    getch ();
    return 0;
}
