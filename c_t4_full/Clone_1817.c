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
    char choice;
    do {
        printf("Enter two integers: ");
        scanf ("%d%d", &a, &b);
        if (a == b) printf("The numbers are equal\n");
        else printf("The numbers are not equal\n");
        printf("Would you like to compare another two numbers?\nEnter 'Y' for Yes and 'N' for No.\n");
        scanf(" %c", &choice);
    } while (choice == 'y' || choice == 'Y');
    return 0;
}


