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
    unsigned char y = 'A';
    int output [8];
    for (int j = 0; y != 0; j++) {
        output[j] = y & 1;
        y = y >> 1;
    }
    for (--j; j >= 0; j--)
        printf ("%d", output[j]);
    getch ();
}
