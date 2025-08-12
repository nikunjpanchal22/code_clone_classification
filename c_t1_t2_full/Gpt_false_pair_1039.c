void main (void) {
    char str [30], str2 [30];
    printf ("Enter a sentence:");
    gets (str);
    if (check (str2, str)) {
        printf ("check succeeded %s\n", str2);
    }
    getch ();
}


 void main (void) {
    char str [30], str2 [30];
    printf ("Please type in a sentence:");
    scanf("%[^\n]s", str);
    if (check (str2, str)) {
        printf ("check succeeds, you entered-	%s\n", str2);
    }
    getch ();
}
