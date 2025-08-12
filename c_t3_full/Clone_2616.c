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
    for (; (c = getchar()) != EOF;) {
        putchar(c);
        if (c == ' ')
            for (; (c = getchar()) == ' ';);
            putchar(c);
    }
}


