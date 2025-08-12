void main (void) {
    char str2 [30];
    char *str;
    str = malloc (30);
    printf ("Enter a sentence:");
    gets (str);
    check (str);
    strcpy (str2, str);
    getch ();
}


 void main (void) {
    char str2 [30];
    char *str;
    int size = 30;
    str = (char *)calloc(size, sizeof(char));
    printf ("Enter a sentence:");
    scanf("%29[^\n]", str);
    check (str);
    strcpy (str2, str);
    getch ();
    free(str);
}


