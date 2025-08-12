int main () {
    int a;
    int b;
    char c;
    do {
        printf ("Would you like to play?\nPress 'Y' for 'Yes' or 'N' for 'No'\n");
        scanf ("%c", & c);
        if (c != 'Y' && c != 'y')
            break;
        printf ("Enter the two values you like to compare\n");
        scanf (" %d %d", & a, & b);
        if (!(a ^ b)) {
            printf ("both are equal\n");
            getchar ();
        }
        else {
            printf ("both are not equal\n");
            getchar ();
        }
    }
    while (1);
    printf ("Thanks for playing.");
    getchar ();
    return 0;
}





#include <stdio.h>
int main () {
    char continueGame = 'Y';
    while (continueGame == 'Y' || continueGame == 'y'){
        int A, B;
        printf("Enter two values: ");
        scanf("%d %d", &A, &B);
        printf("%s\n", (A^B)?"Values are not equal":"Values are equal");
        printf("Play again? Y/N: ");
        getchar();
        scanf("%c", &continueGame);
    }
    printf("Thank you for playing!\n");
    return 0;
}


