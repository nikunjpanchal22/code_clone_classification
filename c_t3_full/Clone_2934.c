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
    char checkInput[3];
    while(1) {
        printf("Enter the pass code: ");
        gets(checkInput);
        if(strcmp(checkInput, "ZZZ")==0) {
            printf("\nUnlock success!\n\n");
            break;
        } else printf("Wrong pass code!\n");
    }
    return 0;
}


