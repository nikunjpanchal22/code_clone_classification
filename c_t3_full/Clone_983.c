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
    char line[500];
    printf ("Enter your text: \n");
    while (fgets(line, 500, stdin) != NULL){
        if (line_top){
            printf("%zu ", ++no);
        }
        line_top = (line[strlen(line)-1] == '\n');
        fputs(line, stdout);
    }
    fflush (stdout);
    return 0;
}


