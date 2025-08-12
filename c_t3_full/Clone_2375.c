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

int wordCalculator(int *word, unsigned long int number, int base) {
	    int i = 0;
	    while(number != 0) {
		word[i]= number%base;
		number/= base;
		i++;
	    }
	    return i;
	}

	int main() {
	    int base, length;
	    unsigned long number;
	    int word[32]={0};
	    printf("Enter the decimal number to be converted: ");
	    scanf("%ld", &number);
	    printf("\nEnter the new base: ");
	    scanf("%d", &base);
	    length = wordCalculator(word, number, base);
	    printf("The number is: ");
	    for(int i=length-1; i>=0; i--){
		printf("%d",word[i]);
	    }
	    printf("\n");
	    return 0;
}


