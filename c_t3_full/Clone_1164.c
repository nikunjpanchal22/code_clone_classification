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
    int y = 0;
    char ch_array [8];
    while (x != 0) {
        y = x & 1;
        ch_array[--i] = y;
        x = x >> 1;
    }
    for (--i; i>= 0; i--)
        printf("%d", ch_array[i]);
    getch ();
}


