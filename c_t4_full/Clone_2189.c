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





void main() {
    int count = 0;
    char text[1000];
    printf("Enter your text: \n");
    while(fgets(text, sizeof(text), stdin) != NULL) {
        printf("%d %s", ++count, text);
    }
}


