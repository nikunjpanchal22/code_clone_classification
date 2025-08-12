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
    char sentence [30], output[30];
    printf ("Enter something with up to 30 characters: ");
    fgets (sentence, 30, stdin);
    if (check (output, sentence)) {
        printf ("check succeeded, your sentence is-	%s\n", output);
    }
    getch ();
}
