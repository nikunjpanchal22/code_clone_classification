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
	    int val, positive = 0, negative = 0;
	    do {
		printf ("Enter Value: ");
		if (!scanf ("%d", &val)) {
		    while ((getchar()) != '\n');
		    printf ("Error...Try Again\n");
		    continue;
		}
		if (val > 0)
		    positive++;
		else if (val < 0)
		    negative++;
	    } while (val != 0);
	    printf ("Got %d positive and %d negative numbers\n", positive, negative);
	    return 0;
}


