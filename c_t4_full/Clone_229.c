main () {
    int c;
    while ((c = getchar ()) != EOF) {
        if (c == ' ') {
            putchar (c);
            while ((c = getchar ()) == ' ')
                ;
        }
        if (c != ' ')
            putchar (c);
    }
}


 main () {
    int c;
    int noBlankSpace;
    noBlankSpace = 0;
    c = getchar();
    while (c != EOF) {
        if (c == ' ') {
            if (noBlankSpace == 0) {
                putchar(c); 
                noBlankSpace = 1;
            } 
        }
        else {
            putchar(c);
            noBlankSpace = 0;
        }
        c = getchar();
    }
}


