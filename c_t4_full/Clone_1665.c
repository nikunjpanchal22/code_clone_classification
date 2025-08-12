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
#include <string.h>

void wordCalculator(unsigned long num, int base, char *buffer) {
	    int i = 30;
	    int temp = 0;
	    for(; num>0; --i, num/=base) {
		temp = num % base;
		buffer[i] = (temp > 9) ? temp + 55 : temp + 48;
	    }
	    memmove(buffer, buffer + i + 1, 31 - i);
	}

	int main() {
	    char buffer[32];
	    int base;
	    unsigned long number;
	    printf("Enter the decimal number to be converted: ");
	    scanf("%ld", &number);
	    printf("\nEnter the new base: ");
	    scanf("%d", &base);
	    wordCalculator(number, base, buffer);
	    printf("The number is: %s\n", buffer);
	    return 0;
}


