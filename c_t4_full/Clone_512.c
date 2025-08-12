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
    int x = 0;
    int y = 0;
    char ch_array [8];
    int i = 0;
    x = 'A';
    do {
        y = x & 1;
        ch_array[i] = y;
        ++i;
        x = x >> 1;
    } while (x != 0);
    i--;
    for (int j = i; j >= 0; j-- ) {
        printf("%d\n", ch_array[j]);
    }
    getch ();
}


