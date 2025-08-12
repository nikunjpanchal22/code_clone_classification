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
    int noSpace;
    noSpace = 0;
    c = getchar();
    while (c != EOF) {
        if (c == ' ') {
            if (noSpace == 0) {
                putchar(c); 
                noSpace = 1;
            }  
        }
        else {
            putchar(c);
            noSpace = 0;
        }
        c = getchar();
    } 
} 


