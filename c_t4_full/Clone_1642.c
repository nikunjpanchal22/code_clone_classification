int main (void) {
    int n = 123456;
    int divider = 1;
    for (int i = 0; i < getNumberOfDigits (n) / 2; i++) {
        divider *= 10;
    }
    printf ("%d, %d\n", n / divider, n % divider);
    return 0;
}




#include<stdio.h>
#define NO_OF_DIGITS(n) floor(log10(abs(n))) + 1
int main () {
	 int n = 123456;
	 int divider = pow(10,NO_OF_DIGITS(n)/2);
	 printf ("%d, %d\n", n / divider, n % divider);
	 return 0;
}


