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


 int main (void) {
    size_t no = 0;
    bool line_top = true;
    char line[1024];
    printf ("Enter your text: \n");
    while (fgets (line, 1024, stdin)) {
        for (int i = 0; i < strlen (line); i++) {
            if (line_top)
                printf ("%zu ", ++no);
            line_top = (line[i] == '\n');
            putchar (line[i]);
        }
    }
    fflush (stdout);
    return 0;
}


