int main () {
    int a, b, s, c;
    printf ("Enter two proper numbers: ");
    for (;;) {
        s = scanf ("%d%d", &a, &b);
        if (s == 2)
            break;
        if (s == EOF) {
            printf ("unexpected end of file\n");
            return 1;
        }
        while ((c = getchar ()) != EOF && c != '\n')
            continue;
        printf ("Invalid input. Try again: ");
    }
    printf ("The values are %d and %d\n", a, b);
    return 0;
}





#include <stdio.h>
int main () {
	    int a, b, c;
	    puts ("Enter two numbers now: ");
	    while (!(scanf ("%d%d", &a, &b) == 2)) {
		if (feof(stdin)) {
		    puts ("end of file encountered");
		    return 1;
		}
		while ((c = getchar ()) != EOF && c != '\n');
		puts ("Input is not correct. Please re-enter: ");
	    }
	    printf ("You've given %d and %d\n", a, b);
	    return 0;
}


