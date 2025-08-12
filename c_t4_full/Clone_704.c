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
    int c = getchar();
    while (c != EOF) {
        putchar(c);
        c = getchar();
    }
}


