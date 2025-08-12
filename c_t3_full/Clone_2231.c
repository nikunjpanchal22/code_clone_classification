int main (void) {
    int number, p = 0, n = 0;
    while (1) {
        printf ("-> ");
        if (scanf ("%d", &number) == 0) {
            fflush (stdin);
            printf ("Err...\n");
            continue;
        }
        fflush (stdin);
        if (number > 0)
            p++;
        else if (number < 0)
            n++;
        else
            break;
    }
    printf ("Read %d positive and %d negative numbers\n", p, n);
    return 0;
}






#include <stdio.h>
int main () {
	    int n, pos = 0, neg = 0;
	    do {
		printf ("Please enter a number: ");
		if (!scanf ("%d", &n)) {
		    while ((getchar()) != '\n');
		    printf ("Error...Try Again\n");
		    continue;
		}
		if (n > 0)
		    pos++;
		else if (n < 0)
		    neg++;
	    } while (n != 0);
	    printf ("There were %d positive and %d negative numbers\n", pos, neg);
	    return 0;
}


