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
    int length = getline(&str, &size, stdin);
    check (str);
    for (int i=0; i < length; i++)
        str2[i] = str[i];
    str2[length] = '\0';
    getchar ();
    free(str);
}


