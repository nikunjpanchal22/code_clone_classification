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
    scanf("%[^\n]", str);
    check (str);
    for (int i=0; i <30; i++)
        str2[i] = str[i];
    getch ();
    free(str);
}


