int main () {
    int dec_num;
    printf ("type in a 3 digit number to convert to binary\n");
    if (scanf ("%d", &dec_num) != 1) {
        printf ("invalid input\n");
        return 1;
    }
    if (dec_num < 0 || dec_num > 999) {
        printf ("invalid value: must have at most 3 digits\n");
        return 1;
    }
    for (;;) {
        if (dec_num % 2 != 0) {
            printf ("1");
        }
        else {
            printf ("0");
        }
        dec_num = dec_num / 2;
        if (dec_num == 0)
            break;
    }
    printf ("\n");
    return 0;
}





#include <stdio.h>
#define MAX 10

void binary_conversion(int);
 
int main() {
	    int num;
	    printf("Enter a number to convert to binary: ");
	    scanf("%d", &num);
	    if (num < 0 || num > 999) {
		printf("Invalid input. Input must be a three-digit number.");
		return 1;
	    }
	    binary_conversion(num);
	    return 0;
	}

	void binary_conversion(int num) {
	    int binary_num[MAX];
	    int i =0;
	    while(num > 0) {
		binary_num[i] = num % 2;
		num = num / 2;
		i++;
	    }
	    for(int j = i -1; j >= 0; j--) {
		printf("%d",binary_num[j]);
	    }
	}



int main() {
    int n;
    printf("Please enter a 3-digit number: ");
    scanf("%d", &n);
    if(n < 0 || n > 999) {
        printf("Invalid value: must be a 3-digit number\n");
        return 1;
    }
    int binary[32];
    int i = 0;
    while(n > 0) {
        binary[i] = n % 2;
        n = n / 2;
        i++;
    }
    for(int j = i - 1; j >= 0; j--) {
        printf("%d", binary[j]);
    }
    return 0;
}


