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
    int blankSpace;
    blankSpace = 0;
    c = getchar();
    while (c != EOF) {
        if (c == ' ') {
            if (blankSpace == 0) {
                putchar(c); 
                blankSpace = 1;
            }
        }
        else {
            putchar(c);
            blankSpace = 0;
        }
        c = getchar();
    } 
} 


