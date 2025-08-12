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
#define YES 'Y'
#define NO 'N'

int valueEqualChecker() {
	    int a, b;
	    printf("Enter the two values you like to compare\n");
	    scanf ("%d %d", & a, & b);
	    printf ("both are %sequal\n", a == b ? "" : "not ");
	}

	int main() {
	    char gameContinue = YES;
	    while (gameContinue == YES || gameContinue == 'y') {
		printf("Do you want to play again ? (Y/N)\n");
		scanf(" %c",&gameContinue);

		if(gameContinue != YES) {
		    break;
		}
		valueEqualChecker();
	    }
	    printf("You exited the game\n");
	    return 0;
}


