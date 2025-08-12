void main () {
    clrscr ();
    printf ("Welcome\n\n\n");
    unsigned char x = 'A';
    char ch_array [8];
    for (int i = 0; x != 0; i++) {
        ch_array[i] = x & 1;
        x = x >> 1;
    }
    for (--i; i >= 0; i--)
        printf ("%d", ch_array[i]);
    getch ();
}


 void main () {
    clrscr ();
    printf ("Welcome\n\n\n");
    unsigned char x = 'A';
    char ch_array [8];
    int i = 0;
    do {
        ch_array[i] = x & 1;
        x = x >> 1;
        i++;
    } while (x != 0);
    while (i-- > 0)
        printf ("%d", ch_array[i]);
    getch ();
}


