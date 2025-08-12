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
    system("clear");
    printf("Good evening\n\n\n");
    unsigned char sample = 'Y';
    char bit_rpr[8];
    int index = 0;
    do {
        bit_rpr[index++] = sample & 1;
        sample = sample >> 1;
    } while (sample != 0);
    do
        putchar(bit_rpr[--index] + '0');
    while(index > 0);
    getchar();
}


