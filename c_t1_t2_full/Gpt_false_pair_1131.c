int main () {
    int flag;
    printf ("Prime numbers:  2\t");
    for (int i = 3; i <= 100; i++) {
        flag = 0;
        for (int j = 2; j < i; j++) {
            if (i % j == 0) {
                flag = 1;
                break;
            }
        }
        if (flag == 0) {
            printf ("%d\t", i);
        }
    }
    getch ();
    return 0;
}


 int main () {
    int flag;
    printf ("Prime numbers:  2\t");
    for (int i = 3; i <= 100; i+=2) {
        flag = 0;
        for (int j = 2; j < i/2; j++) {
            if (i % j == 0) {
                flag = 1;
                break;
            }
        }
        if (flag == 0) {
            printf ("%d\t", i);
        }
    }
    getch ();
    return 0;
}
