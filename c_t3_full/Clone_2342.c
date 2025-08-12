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
	    int num=0;
	    printf ("Enter an integer: ");
	    if (scanf ("%d", &num) != EOF) printf ("You entered: %d\n", num);
	    else puts ("Invalid input");
	    return 0;
}


