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
    int c;
    while ((c = getchar()) != EOF) {
        if (c == ' ') {
            while ((c = getchar()) == ' ');
            printf(" %c", c);
        }
        else
            printf("%c", c);
    }
    return 0;
}


