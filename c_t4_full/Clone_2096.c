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
    while (true) {
        c = getchar();
        if (c == EOF) break;
        putchar(c);
        if (c == ' ')
            while ((c = getchar()) == ' ')
                if (c == EOF) break;
            putchar(c);
    }
}


