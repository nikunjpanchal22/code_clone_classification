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
int main () {
	    int x, i=0;
	    printf ("Enter a three digit number: ");
	    scanf ("%d", &x);
	    int binaryNumber[120] = {0};

	    while(x > 0) {
		binaryNumber[i++] = x % 2;
		x /= 2;
	    }

	    for(int j = i - 1; j >= 0; j--)
		printf("%d", binaryNumber[j]);
	    return 0;
}


