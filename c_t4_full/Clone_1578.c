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

void process(int num) {
	    printf("You entered: %d\n", num);
	}

	int main() {
	    int num;
	    printf ("Enter an integer: ");
	    if(scanf ("%d", &num)) process(num);
	    else puts ("Invalid input");
	    return 0;
}


