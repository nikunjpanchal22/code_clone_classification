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
    int i = 0, j = 1;
    char ch, text[1000];
    printf("Enter your text: \n");
    while((ch = getchar()) != EOF) {
        text[i++] = ch;
        if(ch == '\n') {
            printf("%d ", j++);
            puts(text);
            i = 0;
        }
    }
    return 0;
}


