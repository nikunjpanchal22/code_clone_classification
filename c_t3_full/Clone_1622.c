main () {
    int c;
    while (1) {
        c = getchar ();
        if (c == EOF) {
            break;
        }
        putchar (c);
    }
}


 main () {
    int c;
    do {
        c = getchar();
        if (c != EOF) {
            putchar(c);
        }
    } while (c != EOF);
}


