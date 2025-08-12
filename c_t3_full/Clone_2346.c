int main (void) {
    int number;
    printf ("Enter an integer: ");
    if (scanf ("%d", &number) == 1) {
        printf ("You entered: %d\n", number);
    }
    else {
        puts ("Invalid input");
    }
    return 0;
}




#include <stdio.h>

int main () {
	    int num;
	    printf("Enter an integer: ");
	    if(scanf ("%d", &num) > 0) printf ("You entered: %d\n", num);
	    else puts ("Invalid input");
	    return 0;
}


