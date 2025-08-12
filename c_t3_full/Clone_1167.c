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
    const int SIZE = 8;
    char ch_array [SIZE];
    for (int i = 0; x != 0; i++)
        ch_array[i] = (x & 1);
            x = x >> 1;
    for (int j = SIZE - 1; j >= 0; j-- )
        printf("%d", ch_array[j]);
    getch ();
}


