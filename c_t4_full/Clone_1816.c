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
int main(void)
{
    char user_answer;
    do
    {
        int num1, num2, result;
        printf("Enter two numbers:\n");
        scanf("%d %d", &num1, &num2);
        result = (num1 == num2) ? 1 : 0;
        if (result) printf("Numbers are equal\n");
        else printf("Numbers are not equal\n");
        printf("Play again? Y/N\n");
        scanf(" %c", &user_answer);
    } while (user_answer == 'Y' || user_answer == 'y');
    return 0;
}


