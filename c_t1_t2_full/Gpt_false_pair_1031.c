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
    char entry [30], str[30];
    printf ("Type up a sentence within 30 characters: ");
    scanf("%[^\n]", entry);
    if (check (str, entry)) {
        printf ("check confirmed, you entered-	%s\n", str);
    }
    getch ();
}
