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
    char string[512];
    printf ("Enter your text: \n");
    while (fgets(string, 512, stdin)!=NULL) {
        if (line_top)
            printf ("%zu ", ++no);
        line_top = (string[strlen(string)-1] == '\n');
        printf("%s", string);
    }
    fflush (stdout);
    return 0;
}


