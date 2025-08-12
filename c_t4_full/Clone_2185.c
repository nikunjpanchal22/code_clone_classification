int main (void) {
    size_t no = 0;
    bool line_top = true;
    printf ("Enter your text: \n");
    while (1) {
        int ch = fgetc (stdin);
        if (ch == EOF)
            break;
        if (line_top)
            printf ("%zu ", ++no);
        line_top = (ch == '\n');
        fputc (ch, stdout);
    }
    fflush (stdout);
    return 0;
}





int main() {
    int idx = 0;
    char ch;
    printf("Enter your text: \n");
    while ((ch = getc(stdin)) != EOF) {
        if (idx++ == 0)
            printf("%d ", idx);
        if (ch == '\n')
            idx = 0;
        putc(ch, stdout);
    }
    return 0;
}


