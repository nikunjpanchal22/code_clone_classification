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
    int a, b;
    char op;

    do {
        printf("Enter two integers: ");
        scanf("%d%d", &a, &b);
        getchar();
        printf("The numbers are %s\n", (a ^ b) ? "different" : "equal");
        printf("Do you want to compare another pair (Y/N): ");
        scanf("%c", &op);
    } while(op == 'Y' || op == 'y');

    printf("Goodbye!\n");

    return 0;
}


