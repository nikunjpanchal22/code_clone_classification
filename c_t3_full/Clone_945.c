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
    fgets (str, 30, stdin);
    check (str);
    for (int i = 0; str[i]; i++)
        str2[i] = str[i];
    str2[i] = '\0';
    getchar();
    free(str);
}


