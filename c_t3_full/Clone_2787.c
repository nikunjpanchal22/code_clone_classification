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
    printf("\033[H\033[J"); // Clear screen in Unix terminal  
    printf("Bonjour\n\n\n");
    unsigned char other_char = 'I';
    char bin_conv[8];
    for (int count = 0; other_char != 0; count++){
        bin_conv[count] = other_char & 1;
        other_char = other_char >> 1;
    }
    count--;
    do    
        putc(bin_conv[count] + '0', stdout);
    while (count-- > 0);
    getchar();
}


