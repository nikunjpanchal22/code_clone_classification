main () {
    int c;
    while ((c = getchar ()) != EOF) {
        putchar (c);
        if (c == ' ') {
            while ((c = getchar ()) == ' ')
                ;
            putchar (c);
        }
    }
}



main () {
    int d;
    while ((d = getchar ()) != EOF) {
        putchar (d);
        if (d == '\n') {
            while ((d = getchar ()) == '\n')
                ;
            putchar (d);
        }
    }
}
