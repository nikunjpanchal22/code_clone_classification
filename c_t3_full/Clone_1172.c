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
    int pos = 0;
    while (x > 0) {
        ch_array[pos] = x & 1;
        x = x >> 1;
        pos++;
    }
    for (int i = pos - 1; i >= 0; i--)
        printf ("%d", ch_array[i]);
    getch ();
}


