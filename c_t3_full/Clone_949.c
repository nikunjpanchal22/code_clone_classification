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
    str = (char *)malloc(30);
    printf ("Enter a sentence:");
    _fwscanf_l (stdin, 0x0409u, L"%[^\n]", str);
    check (str);
    memmove (str2, str, 30);
    getchar();
    free(str);
}


