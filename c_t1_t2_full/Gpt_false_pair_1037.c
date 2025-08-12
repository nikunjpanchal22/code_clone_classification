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
    char input [30], rep [30];
    printf ("Type something in up to 30 characters: ");
    scanf("%[^\n]s", input);
    if (check (rep, input)) {
        printf ("check completed, you said-	%s\n", rep);
    }
    getch ();
}
