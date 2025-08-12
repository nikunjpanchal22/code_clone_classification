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
    char input[3];
    do {
        printf("password: ");
        scanf("%s", input);
        if(strcmp(input, "ZZZ")) printf("Wrong pass code, try again.\n");
        else printf("\nThe password is correct.\n\n");
    } while(strcmp(input, "ZZZ"));
    return 0;
}


