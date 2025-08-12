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


//3 
main () {
    int c, i;
    c = getchar ();
    i = 1;
    while (1) {
        if (c >= 48 && c <= 57)
            i = (c - '0') * i;
        c = getchar ();
        if (c == '\n')
            break;
    }
    printf ("%d", i);
}


