int main (void) {
    int i, base;
    int word [32];
    unsigned long int number;
    printf ("Enter the decimal number to be converted: ");
    scanf ("%ld", & number);
    printf ("\nEnter the new base: ");
    scanf ("%d", & base);
    i = wordCalculator (word, number, base);
    printf ("The number is: ");
    for (; i >= 0; i--) {
        if (word[i] <= 9)
            printf ("%d", word[i]);
        else
            printf ("%c", (65 - 10 + word[i]));
    }
    printf ("\n");
}





#include <stdio.h>
#include <math.h>

int wordCalculator(int *word, unsigned long int number, int base) {
	    int i = 0;
	    while (number != 0) {
		word[i] = number % base;
		number = number / base;
		i++;
	    }
	    return i - 1;
	}

	int main(void) {
	    int i, base;
	    int word[32];
	    unsigned long int number;
	    printf("Enter the decimal number to be converted: ");
	    scanf("%ld", &number);
	    printf("\nEnter the new base: ");
	    scanf("%d", &base);
	    i = wordCalculator(word, number, base);
	    printf("The number is: ");
	    for (; i >= 0; i--) {
		if (word[i] <= 9)
		    printf("%d", word[i]);
		else
		    printf("%c", (65 - 10 + word[i]));
	    }
	    printf("\n");
}


