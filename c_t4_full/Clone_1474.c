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




int main() {
    int c, isWhitespace = 0;
    while ((c = getchar()) != EOF) {
        if (c == ' ')
            isWhitespace = 1;
        else {
            if (isWhitespace) {
                putchar(' ');
                isWhitespace = 0;
            }
            putchar(c);
        }
    }
    return 0;
}


