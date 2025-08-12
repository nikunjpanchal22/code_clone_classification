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
    int e;
    while ((e = getchar ()) != EOF) {
        putchar (e);
        if (e == '.') {
            while ((e = getchar ()) == '.')
                ;
            putchar (e);
        }
    }
}
