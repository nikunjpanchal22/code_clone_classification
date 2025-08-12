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
int main() {
	    int dec_num = 0, array[200] = {0}, i = 0;
	    printf("Enter a 3-digit number: ");
	    if (scanf("%d", &dec_num) == 1) {
		while (dec_num > 0) {
		    array[i++] = dec_num % 2;
		    dec_num /= 2;
		}
		for (; i > 0; i--)
		    printf("%d", array[i-1]);
	    } else {
		printf("Invalid input.\n");
	    }
	    return 0;
}


