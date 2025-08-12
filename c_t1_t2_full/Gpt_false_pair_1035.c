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
    char sentence [30], copy[30];
    printf ("Type in a sentence of maximum 30 characters: ");
    fgets (sentence, 30, stdin);
    if (check (copy, sentence)) {
        printf ("check passed, you typed-	%s\n", copy);
    }
    getch ();
}
