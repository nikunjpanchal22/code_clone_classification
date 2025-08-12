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
    char repeat = 'y';
    while (repeat == 'Y' || repeat == 'y') {
        int x, y;
        printf("Enter two numbers: ");
        scanf("%d %d", &x, &y);
        getchar();
        printf("%s\n", x == y ? "Numbers are equal": "Numbers are unequal");
        printf("Do you want to continue? Y for Yes, any other key to exit.\n");
        scanf("%c", &repeat);
    }
    return 0;
}


