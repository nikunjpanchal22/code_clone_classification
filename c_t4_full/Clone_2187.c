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
    char ch;
    int counter = 0;
    while((ch = getchar()) != EOF) {
        if(ch == '\n')
            printf("%d ", ++counter);
        if(ch != '\n')
            putchar(ch);
    }
    return 0;
}


