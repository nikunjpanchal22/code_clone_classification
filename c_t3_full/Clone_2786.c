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
void main(){
        printf("\033[H\033[J"); // Clear screen in Unix terminal  
        printf("Welcome to this app!\n\n\n");
        unsigned char user_char = 'D';
        char char_to_bit [8];
        for (int j = 0; user_char != 0; j++) {
            char_to_bit[j] = user_char & 1;
            user_char = user_char >> 1;
        }
        --j;
        do 
            printf("%d", char_to_bit[j]);
        while(j-- > 0);
        getchar();
}


