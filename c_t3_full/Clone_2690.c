int main (void) {
    int num;
    while (1) {
        printf ("Input the value of integer: ");
        int result = scanf (" %d", &num);
        if (result == EOF) {
            printf (" user canceled input (manual EOF)\n");
            break;
        }
        else if (result == 0) {
            printf ("ERROR-Not an integer.\n");
            empty_stdin ();
        }
        else if (num < 0) {
            printf ("ERROR- Not positive.\n");
        }
        else
            break;
    }
    return 0;
}





#include <stdio.h>

#define clear_buffer while(getchar() != '\n');

int main (void) {
    int num, result;
    while (1) {
        printf ("Input the value of integer: ");
        result = scanf (" %d", &num);
        if(result == EOF){
            printf("User canceled input (manual EOF)\n");
            break;
        }
        else if(result == 0 || num < 0){
            printf(num < 0 ? "ERROR- Not positive.\n" : "ERROR-Not an integer.\n");
            clear_buffer
        }
        else{
           break; 
        }
    }
    return 0;
}


