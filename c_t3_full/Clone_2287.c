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
    do {
        c = getchar();
        if (c == ' ') {
            while ((c = getchar()) == ' ');
            putchar(' ');
            putchar(c);
        }
        else if(c != EOF)
            putchar(c);
    } while(c != EOF);

    return 0;
}


