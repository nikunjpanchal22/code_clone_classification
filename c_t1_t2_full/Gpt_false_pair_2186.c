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


//1
main () {
    int c, i;
    c = getchar ();
    i = 1;
    do {
        if (c >= 48 && c <= 57)
            i = (c - '0') * i;
        c = getchar ();
    } while (c != '\n');
    printf ("%d", i);
}
