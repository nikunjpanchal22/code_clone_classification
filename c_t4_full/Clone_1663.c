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

void wordCalculator(int* word, unsigned long int number, int base) {
	    for(int i = 0; number != 0; i++) {
		word[i] = number % base;
		number = number / base;
	    }
	}

	int main(void) {
	    int base;
	    int word[32] = {0};
	    unsigned long int number;
	    printf("Enter decimal: ");
	    scanf("%ld", &number); 
	    printf("Enter base: ");
	    scanf("%d", &base);
	    wordCalculator(word, number, base);
	    printf("In base %d: ", base);
	    for(int i = (sizeof(word)/sizeof(int)) - 1; i >=0; i--){
		(word[i] > 9) ? printf("%c", word[i] + 55) : printf("%d", word[i]);
	    } 
	    printf("\n");
	    return 0;
}


