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
#include <string.h>

void wordCalculator(char* word, unsigned long int number, int base) {
	    int i = 0;
	    do {
		int digit = number % base;
		word[i++] = digit < 10 ? '0' + digit : 'A' - 10 + digit;
		number /= base;
	    } while (number != 0);
	    word[i] = '\0';
	    strrev(word);
	}

	int main() {
	    unsigned long number;
	    int base;
	    char word[32];
	    printf("Enter the decimal number to be converted: ");
	    scanf("%ld",&number);
	    printf("\nEnter the new base: ");
	    scanf("%d",&base);
	    wordCalculator(word, number, base);
	    printf("The number in base %d is: %s\n", base, word);
	    return 0;
}


