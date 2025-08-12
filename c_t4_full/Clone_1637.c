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
int main () {
	 int n = 123456, i = 0, num = n, divider = 1;
	 while(num != 0) {
	    num /= 10;
	    i++;
	 }
	 for (int j = 0; j < i/2; j++)
	    divider *= 10;
	 printf ("%d, %d\n", n / divider, n % divider);
	 return 0;
}


