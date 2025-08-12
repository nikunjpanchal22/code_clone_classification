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
    while (x) {
        ch_array[i] = x & 1;
        x = x >> 1;
        i++;
    }
    for (int j = 0; j < i; j++)
        printf ("%d", ch_array[i - j - 1]);
    getch ();
}


