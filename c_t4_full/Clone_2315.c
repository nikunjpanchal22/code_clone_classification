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

void flushStdin(){
    char c;
    while ((c = getchar()) != '\n' && c != EOF);
    }

int main() {
    int num;
    while (printf("%.30sInput the value of integer: ", ""), (scanf("%d", &num) <= 0 || num < 0) && printf("Error: Invalid input!\n") && flushStdin());
    return 0;
}


