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






#include<stdio.h>
#include<string.h>

int main() {
    char pass[3];
    printf("\nEnter pass code: ");
    while (scanf("%s", pass) && strcmp(pass, "ZZZ") != 0)
    {
        printf("Incorrect!\n Enter pass code: ");
    }
    printf("\nAccess granted!\n\n");
    return 0;
}


