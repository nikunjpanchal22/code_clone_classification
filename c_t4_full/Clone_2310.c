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

#define flush_stdin() while(getchar() != '\n')

int main (void) {
    int num, r;
    char line[100];
    while (1) {
        printf ("Input the value of integer: ");
        r = scanf ("%d", &num);
        if (r == EOF || ((r != 1 || num < 0) && (flush_stdin(), printf("Invalid input! Try again.\n"), 1)));
        else 
            break;
    }
    return 0;
}


