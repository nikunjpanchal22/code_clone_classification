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
#include<math.h>
int main () {
	 int n = 123456;
	 int divider = pow(10, (int)log10(n)/2);
	 printf ("%d, %d\n", n / divider, n % divider);
	 return 0;
}


