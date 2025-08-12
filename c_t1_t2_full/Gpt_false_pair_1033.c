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
    char statement [30], copy[30];
    printf ("Type something up to 30 characters long: ");
    gets (statement);
    if (check (copy, statement)) {
        printf ("check successful, your entry is-	%s\n", copy);
    }
    getch ();
}
