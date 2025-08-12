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



 

#include <stdio.h>
void main()
{
    system("cls");
    printf("Good day\n\n\n");
    unsigned char letter = 'Z';
    char binary_val[8];
    int i = 0;
    do {        
        binary_val[i++] = letter & 1;
        letter = letter >> 1;
    } while (letter != 0);
    while (i-- > 0)
        fputc(binary_val[i] + '0', stdout);
    getch();
}


