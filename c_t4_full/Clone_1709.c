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





int main () {
    int c;
    while (true) {
        c = getchar();
        switch(c)
        {
            case EOF: 
                return 0;
            case ' ':
                putchar(c);
                while ((c = getchar()) == ' ');
                putchar(c);
                continue;
            default:
                putchar(c);
        }
    }
    return 0;
}


