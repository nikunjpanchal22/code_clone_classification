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

#define BUFFER_CLEAR while (getchar() != '\n')

int main (void) {
    int num;
    while(scanf ("%d",&num) != 1 || num < 0){
        printf(num < 0 ? "ERROR- Not positive.\n" : "ERROR- Not an integer.\n");
        BUFFER_CLEAR;
    }
    return 0;
}


