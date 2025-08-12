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
inline int length(int number) {return (int) log10 ((double) number) + 1;}
int main () {
	 int n = 123456,divider=1;
	 for (int i = 0; i < length(n)/2; i++)
	    divider *= 10;
	 printf ("%d, %d\n", n / divider, n % divider);
	 return 0;
}


