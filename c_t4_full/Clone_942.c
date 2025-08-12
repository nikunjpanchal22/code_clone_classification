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



 

#define TWO 2
#include <stdio.h>
int main() {

	    int dec_num = 0;
	    printf("Enter a number to convert to binary: ");
	    int read = scanf("%d", &dec_num);
	    if (read == 1) {
		int bin_arr[100] = {0};
		int i = 0;
		while (dec_num > 0) {
		    bin_arr[i] = dec_num % TWO;
		    dec_num = dec_num / TWO;
		    i++;
		}
		for (int j = i - 1; j >= 0; j--)
		    printf("%d", bin_arr[j]);
	    }
	    else {
		printf("Input error\n");
	    }
	    return 0;
}


