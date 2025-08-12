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
int getNumberOfDigits (int n) {
	    int count = 0;
	    while (n != 0) {
		n /= 10;
		++count;
	    }
	    return count;
	}
	int main () {
	 int n = 123456,divider=1;
	 for (int i = 0; i < getNumberOfDigits (n)/2; i++)
	    divider *= 10;
	 printf ("%d, %d\n", n / divider, n % divider);
	 return 0;
}


