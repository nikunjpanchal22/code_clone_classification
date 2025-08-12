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
    while (1) {
        c = getchar();
        if (c == EOF) break;
        putchar(c);
        if (c == ' ')
            while ((c = getchar()) == ' ')
                if (c == EOF) break;
            putchar(c);
    }
}


