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





#include<stdio.h>
int main() {
    char reply;
    do {
        int a, b;
        printf("Enter two numbers: ");
        scanf("%d %d", &a, &b);
        getchar();
        printf("Values are %s.\n", a == b ? "equal" : "different");
        printf("Continue? (Y/N): ");
        scanf("%c", &reply);
    } while (reply == 'Y' || reply == 'y');
    return 0;
}


