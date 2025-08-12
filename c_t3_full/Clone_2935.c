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
    char inputValue[3];
    do {
        printf("\nEnter pass code: ");
        scanf("%s", inputValue);
        if(strcmp(inputValue, "ZZZ")!=0) printf("Wrong pass code!\n");
        else printf("\nYou entered the right pass code!!\n\n");
    } while(strcmp(inputValue, "ZZZ")!=0);
    return 0;
}


