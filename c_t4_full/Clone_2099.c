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
            do { 
                c = getc(stdin); 
            } while (c == ' ');
            putc(c, stdout);
    }
}


