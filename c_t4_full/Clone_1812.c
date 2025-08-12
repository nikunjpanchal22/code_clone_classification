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
int a, b;
char inp;
int main() {
    printf("Press Y to play the game,");
    printf("Press any other button to quit\n");
    scanf("%c", &inp);
    while(inp == 'Y' || inp == 'y'){
        printf("Enter two integers\n");
        scanf("%d%d", &a, &b);
        if(a == b) printf("The numbers are equal\n");
        else printf("The numbers are not equal\n");
        printf("Press Y to play again\n");
        getchar();
        scanf("%c", &inp);
    }
    printf("Thank you for playing the game\n");
    return 0;
}


