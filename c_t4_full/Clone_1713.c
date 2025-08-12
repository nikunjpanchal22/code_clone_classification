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
    while ((c = fgetc(stdin)) != EOF) {
        printf("%c", c);
        if (c == ' ') {
            while ((c = fgetc(stdin)) == ' ');
            printf("%c", c);
        }
    }
    return 0;
}


