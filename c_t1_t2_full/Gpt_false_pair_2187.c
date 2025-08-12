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


//2
main () {
    int c, i;
    c = getchar ();
    i = 1;
    while (c != '\n') {
        if (c >= '0' && c <= '9')
            i = (c - '0') * i;
        c = getchar ();
    }
    printf ("%d", i);
}
