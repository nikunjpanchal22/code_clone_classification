main () {
    int i = 0;
    intc = '';
    system ("stty raw -echo");
    printf ("enter 'q' to quit \n");
    for (; c != 'q'; i++) {
        if (kbhit ()) {
            c = getchar ();
            printf ("\n got %c, on iteration %d", c, i);
        }
    }
    system ("stty cooked echo");
}


main () {
    int i = 0;
    intc = '';
    system ("stty raw -echo");
    printf ("enter 'q' to quit \n");
    for (; c != 'q'; i++) {
        if (kbhit ()) {
            c = getchar ();
            printf ("\n got %c, on iteration %d", c, i);
            if (c == 'a') {
                printf ("You've entered an 'a'");
            }
        }
    }
    system ("stty cooked echo");
}
