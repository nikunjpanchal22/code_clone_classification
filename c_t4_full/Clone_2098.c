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
    char c;
    while(true){
        c = getchar();
        putchar(c);
        if (c == ' ')
            while ( (c = getchar()) == ' ') {};
            putchar(c);
        if (c == EOF) break;
    }
}


