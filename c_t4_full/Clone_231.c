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
    int c, d;
    c = getchar();
    while (c != EOF) {
        if(c == ' ') {
            putchar(c);
            d = getchar();
            while(d == ' ') {
                d = getchar();
            }
            c = d;
        }
        if(c != ' ') 
            putchar(c);
        c = getchar();
    }
}


