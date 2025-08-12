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

int fetch_input(int *num){
	    printf ("Enter an integer: ");
	    return scanf ("%d", num);
	}

	int main () {
	    int num;
	    fetch_input(&num) ? printf ("You entered: %d\n", num) : puts ("Invalid input");
	    return 0;
}


