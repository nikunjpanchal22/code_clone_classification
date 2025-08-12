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
void goodnums (int x) {
		    printf ("Number is either single or triple digits!");
		}
		void badnums (int x) {
		    printf ("The number is two digits!");
		}
		int main (void) {
		    int num;
		    printf ("Enter a number: ");
		    scanf ("%d", & num);
		    if (num >= 10 && num <= 99) {
			badnums (num);
		    }
		    else {
			goodnums (num);
		    }
		    return 0;
}


