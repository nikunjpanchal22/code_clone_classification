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
    while ((c = getchar()) != EOF) {
        printf("%c", c);
        if (c == ' ')
            while ((c = getchar()) == ' ');
            printf("%c", c);
    }
}


