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
    fgets (str, 30, stdin);
    check (str);
    memcpy_s(str2, 30, str, 30);
    getch ();
    free(str);
}


