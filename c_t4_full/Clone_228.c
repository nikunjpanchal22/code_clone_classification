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
    int singleSpace;
    singleSpace = 0;
    c = getchar();
    while (c != EOF) {
        if (c == ' ') {
            if (singleSpace == 0) {
                putchar(c);
                singleSpace = 1;
            } 
        } 
        else {
            putchar(c);
            singleSpace = 0;
        }
        c = getchar();
    }
}


