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
    int ch;
    while((ch = getchar()) != EOF) {
        if (ch == ' ') {
            do {
                ch = getchar();
            } while (ch == ' ');
            fprintf(stdout, " ");
            fprintf(stdout, "%c", ch);
        }
        else {
            fprintf(stdout, "%c", ch);
        }
    }
    return 0;
}


