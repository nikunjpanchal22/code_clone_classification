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
int main(){
    system("cls");
    puts("Hello again\n\n\n");
    unsigned char y = 'G';
    char arr_binary[8];
    for (int i = 0; y != 0; i++){
        arr_binary[i] = y & 1;
        y = y >> 1;
    }
    for (--i; i >= 0; i--)
        putchar(arr_binary[i] + '0');
    getchar();
    return 0;
}


