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
    char str [30], cpy[30];
    printf ("Type a sentence (30 characters or less): ");
    scanf("%[^\n]s", str);
    if (check (cpy, str)) {
        printf ("check approved, you typed-	%s\n", cpy);
    }
    getch ();
}
