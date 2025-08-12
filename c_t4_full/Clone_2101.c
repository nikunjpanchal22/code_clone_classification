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





main() {
    int c;
    while ((c = getc(stdin)) != EOF) {
        putc(c, stdout);
        if (c == ' ')
            while ((c = getc(stdin)) == ' ');
            putc(c, stdout);
    }
}


