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


 int main()
{
    char ch;
    do {
        ch = getchar();
        if (ch == ' ') {
            do {
                ch = getchar();
            } while (ch == ' ');
            putchar(' ');
            putchar(ch);
        }
        else {
            putchar(ch);
        }
    } while (ch != EOF);
    return 0;
}


