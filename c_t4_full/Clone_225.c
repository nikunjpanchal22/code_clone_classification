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
    int oneSpace;
    oneSpace = 0;
    c = getchar();
    while (c != EOF) {
        if (c == ' ') {
            if (oneSpace == 0) {
                putchar(c);
                oneSpace = 1;
            } 
        }
        else {
            putchar(c);
            oneSpace = 0;
        }
        c = getchar();
    }
}


