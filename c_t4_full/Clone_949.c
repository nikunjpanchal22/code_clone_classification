int main () {
    int dec_num;
    int i = 0;
    printf ("type in 3 digits number to convert to binary\n");
    int flag = scanf ("%d", &dec_num);
    if (flag != 1) {
        printf ("Input is not recognized as an integer");
        return 0;
    }
    int size = 0;
    int array [120] = {0};
    while (dec_num > 0) {
        if (dec_num % TWO != 0) {
            array[i] = 1;
        }
        else if (dec_num % TWO == 0) {
            array[i] = 0;
        }
        size = ++i;
        dec_num = dec_num / TWO;
    }
    for (i = size - 1; i >= 0; i--)
        printf ("%d", array[i]);
    return 0;
}


              


#include <stdio.h>
#define TWO 2
void main() 
{
	  int n, binary, dec = 0, base = 1, rem, n1;
	  printf("Enter a number: ");
	  scanf("%d", &n);
	  n1 = n;
	  while (n > 0) 
	  {
	    rem = n % TWO;
	    binary = binary + rem * base;
	    n = n / TWO;
	    base = base * 10;
	  }
	  printf("Binary of number %d = %d \n", n1, binary);
}


