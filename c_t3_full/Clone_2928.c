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
    char input_code[3];
    while(1) {
        printf("\nEnter pass code: ");
        scanf("%2s", input_code);
        if(!strcmp(input_code, "ZZZ")) {
            break;
        } else {
            printf("\nTry again!\n");
        }
    }
    printf("\nSuccess!\n\n");
    return 0;
}


