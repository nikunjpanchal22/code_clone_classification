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
    printf("Enter your text: \n");
    while((ch = getchar()) != EOF) {
        counter++;
        if(counter == 1 || ch == '\n')
            printf("%d ", counter);
        if(ch == '\n')
            counter = 0;
        putchar(ch);
    }
    return 0;
}


