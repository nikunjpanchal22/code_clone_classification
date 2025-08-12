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
        system("clear");
        printf("Hello\n\n\n");
        unsigned char b = 'C';
        char bit_arr [8];
        int i = 0;
        while (b != 0){
            bit_arr[i] = b & 1;
            b = b >> 1;
            i++;
        }
        while(i-- > 0) 
            printf("%d", bit_arr[i]);
        getchar();
}


