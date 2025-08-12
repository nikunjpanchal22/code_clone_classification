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
		    printf ("Two digit number between 10 and 20");
		}
		void goodnums (int x) {
		    printf ("Two digit number not between 10 and 20");
		}
		int main (void) {
		    int num;
		    printf ("Enter a two digit number: ");
		    scanf ("%d", & num);
		    if (num >= 10 && num <= 99) {
			if(num > 10 && num < 20) {
			    badnums (num);
			}
			else {
			    goodnums(num);
			}
		    }
		    return 0;
}


