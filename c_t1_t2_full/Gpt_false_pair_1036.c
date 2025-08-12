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
    char text [30], duplicate [30];
    printf ("Enter a phrase with up to 30 characters: ");
    scanf("%29[^\n]", text);
    if (check (duplicate, text)) {
        printf ("check confirmed, you entered-	%s\n", duplicate);
    }
    getch ();
}
