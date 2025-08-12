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
    int space;
    c = getchar();
    space = 0;
    while (c != EOF){
        if(c == ' ') {
            if (space == 0) {
                space = 1;
                putchar(c);
            }
        } 
        else {
            space = 0;
            putchar(c);
        }
        c = getchar();
     }
} 


