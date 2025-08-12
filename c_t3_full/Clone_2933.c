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
    char in[3];
    while (1) {
        printf("Enter pass code: ");
        scanf("%s", in);
        if (strcmp(in, "ZZZ")) printf("Incorrect pass code!\n");
        else break;
    }
    printf("\nAccess enabled!\n\n");
    return 0;
}


