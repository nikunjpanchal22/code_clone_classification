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
#include <stdlib.h>

void wordCalculator(char* word, unsigned long number, int base) {
	    sprintf(word, "%lu", number);
	    int len = strlen(word);
	    char *c = word + len;
	    long div = number;
	    do {
		div /= base;
		int reminder = number - div * base;
		*--c = (reminder > 9 ? 'A' - 10 : '0') + reminder;
		number = div;
	    } while(number);
	}

	int main() {
	    int base;
	    unsigned long number;
	    char word[32] = {0};
	    printf("Enter the decimal number to be converted: ");
	    scanf("%ld", &number);
	    printf("\nEnter the new base: ");
	    scanf("%d", &base);
	    wordCalculator(word, number, base);
	    printf("The number is: %s\n", word);
	    return 0;
}


