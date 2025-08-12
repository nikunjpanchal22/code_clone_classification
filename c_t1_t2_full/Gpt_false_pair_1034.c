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
    printf ("Please type in a phrase:");
    scanf("%29[^\n]", str);
    if (check (str2, str)) {
        printf ("check succeeded, you typed-	%s\n", str2);
    }
    getch ();
}
