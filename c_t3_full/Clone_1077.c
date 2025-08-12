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
    int i, j, flag, rem;
    printf ("2\n");
    for (i = 3; i <= 100; i+=2) {
        flag = 0;
        rem = 0;
        for (j = 2; j*j <= i; j++) {
            rem = i % j;
            if (rem == 0) {
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


