int main () {
    int c;
    while ((c = getchar ()) != EOF) {
        if (c == ' ') {
            while ((c = getchar ()) == ' ')
                ;
            putchar (' ');
            putchar (c);
        }
        else
            putchar (c);
    }
    return 0;
}




void recursivePrint(char c) {
    if (c == EOF)
        return;
    if (c == ' ') {
        while ((c = getchar()) == ' ');
        putchar(' ');
        putchar(c);
        recursivePrint(getchar());
    }
    else {
        putchar(c);
        recursivePrint(getchar());
    }
}


