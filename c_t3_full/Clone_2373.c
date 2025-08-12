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
	 int n = 123456;
	 int i = 0, divider = 1;
	 while(i < to_string(n).length()/2) {
	    divider *= 10;
	    i++;
	 }
	 printf ("%d, %d\n", n / divider, n % divider);
	 return 0;
}


