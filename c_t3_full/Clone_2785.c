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
        system("clear");
        puts("Welcome, user!\n\n\n"); 
        unsigned char char_to_trans = 'F';
        char result_array[8]; 
        int i = 0;
        while(char_to_trans != 0){
            result_array[i] = char_to_trans & 1;
            char_to_trans = char_to_trans >> 1; 
            i++;
        }
        while (i-- > 0) 
            printf ("%d", result_array[i]); 
        getchar ();
        return 0; 
}


