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
    bool first = false;
    int count = 0;
    char ch;
    printf("Enter your text: \n");
    while((ch = getchar()) != EOF) {
        if(first == false || ch == '\n') {
            printf("%d ", ++count);
            first = true;
        }
        if(ch == '\n')
            first = false;
        putchar(ch);
    }
    return 0;
}


