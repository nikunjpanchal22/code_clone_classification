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
    char phrase [30], test[30];
    printf ("Type in any 30 characters or less and hit ENTER: ");
    gets (phrase);
    if (check (test, phrase)) {
        printf ("Your sentence checks out-	%s\n", test);
    }
    getch ();
}
