int main (void) {
    int num;
    printf ("Enter a two digit number: ");
    scanf ("%d", & num);
    if (num > 10 && num < 20) {
        badnums (num);
    }
    else {
        goodnums (num);
    }
    return 0;
}





#include <stdio.h>
void badnums (int x) {
		    printf ("BAD NUMBERS!");
		}
		void goodnums (int x) {
		    printf ("GOOD NUMBERS!");
		}
		int main (void) {
		    int num;
		    printf ("Enter a two digit number: ");
		    scanf ("%d", & num);
		    if (num > 10 && num < 20) {
			badnums (num);
		    }
		    else {
			goodnums (num);
		    }
		    return 0;
}


