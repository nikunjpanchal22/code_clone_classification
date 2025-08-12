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
    char pass[3];
    do {
        printf("\nEnter pass code: ");
        scanf("%s", pass);
        if (strcmp(pass, "ZZZ") == 0) {
            printf("\nAccess granted!\n\n");
        } else {
            printf("Incorrect code!\n");
        }
    } while (strcmp(pass, "ZZZ") != 0);

    return 0;
}


