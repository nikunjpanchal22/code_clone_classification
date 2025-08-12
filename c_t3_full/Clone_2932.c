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
    char userInput[3];
    while(1) {
        printf("\nInput the pass code: ");
        scanf("%s",userInput);
        if(strcmp(userInput, "ZZZ") == 0) {
            printf("\nYou've made it!\n\n");
            break;
        }
        else printf("Wrong code!\n");
    }
    return 0;
}


