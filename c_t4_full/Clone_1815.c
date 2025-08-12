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

int comparisonFunction() {
	    int number1, number2;
	    printf("Enter two integers: \n");
	    scanf("%d %d", &number1, &number2);
	    printf("The numbers are %s.\n", number1 == number2 ? "equal" : "unequal");
	}

	int main(void){
	    char answer;
	    do{
		comparisonFunction();
		printf("Continue? (Y/N):\n");
		scanf(" %c", &answer);
	    }while(answer == 'Y' || answer == 'y');
	    printf("Exiting...\n");
	    return 0;
}


