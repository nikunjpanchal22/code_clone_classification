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
    do {
        c = getchar();
        putchar(c);
        if (c == ' ') {
            do {
                c = getchar();
            } while (c == ' ');
            putchar(c);
        }
    } while (c != EOF);
}


