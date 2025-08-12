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


 main() {
    while (!feof(stdin)) {
        putchar(getchar());
    }
}


