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
    unsigned char str [30], str2 [30];
    printf ("Enter a sentence:");
    _getchs (str);
    if (check (str2, str)) {
        printf ("check succeeded %s\n", str2);
    }
    _getch ();
}
