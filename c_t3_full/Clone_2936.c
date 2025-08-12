int main () {
    char input [3];
    printf ("\nHit the pass code!\npass code: ");
    while (input != "ZZZ") {
        scanf ("%s", & input);
        if (strcmp (input, "ZZZ") == 0) {
            printf ("\nYou crack the pass code!!\n\n");
            break;
        }
        else {
            printf ("Wroooong!\n pass code: ");
        }
    }
    return 0;
}






#include <stdio.h>
#include <string.h>

int main() {
    char code[3];
    for (;;) {
        printf("\nEnter your pass code: ");
        gets(code);
        if (strcmp(code, "ZZZ") == 0) break;
        printf("Invalid pass code!\n"); 
    }
    printf("\nWelcome!\n\n");
    return 0;
}


