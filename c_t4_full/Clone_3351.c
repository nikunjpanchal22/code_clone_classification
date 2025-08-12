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
    int c, i;
    for (i = 1; (c = getchar()) != '\n'; )
        if (c >= 48 && c <= 57)
            i *= c - '0';
    printf ("%d\n", i);
}


