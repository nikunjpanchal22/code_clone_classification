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
    unsigned char z = 'A';
    int result [8];
    for (int k = 0; z != 0; k++) {
        result[k] = z & 1;
        z = z >> 1;
    }
    for (--k; k >= 0; k--)
        printf ("%d", result[k]);
    getch ();
}
