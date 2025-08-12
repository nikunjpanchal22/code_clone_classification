main () {
    int c, i;
    c = getchar ();
    i = 1;
    while (c != '\n') {
        if (c >= 48 && c <= 57)
            i = (c - '0') * i;
        c = getchar ();
    }
    printf ("%d", i);
}





void main () {
    int c = getchar();
    int i = 1;
    do {
        if (c >= '0' && c <= '9')
            i = (c - '0') * i;
    } while ((c = getchar()) != '\n');
    printf ("%d", i);
}


