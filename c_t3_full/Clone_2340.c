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
	    char str[20];
	    int num;
	    printf("Enter an integer: ");
	    fgets(str, sizeof(str), stdin);
	    if(sscanf(str, "%d", &num)) printf ("You entered: %d\n", num);
	    else puts ("Invalid input");
	    return 0;
}


