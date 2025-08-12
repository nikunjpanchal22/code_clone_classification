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
    char passIn[3];
    while(1) {
        printf("\nEnter the correct pass code to proceed: ");
        scanf("%s", passIn);
        if(strcmp(passIn, "ZZZ") != 0) {
            printf("That's the wrong pass code!\n");
        } else {
            printf("\nThe pass code is right!!\n\n");
            break;
        }
    }
    return 0;
}


