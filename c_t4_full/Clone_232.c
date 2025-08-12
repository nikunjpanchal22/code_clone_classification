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
    int  c;
    c = getchar();
    while (c != EOF) {
        if(c != ' ') {
            putchar(c);
        }
        else {
            putchar(c); 
            while ( (c = getchar()) == ' ');
        }
        c = getchar();
    }
}


