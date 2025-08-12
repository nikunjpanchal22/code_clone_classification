int main (void) {
    char a [100], b [100], c;
    if (scanf ("%99[^\n]%c%99[^\n]", a, &c, b) == 3 && c == '\n') {
        if (strstr (a, b))
            printf ("its a substring\n");
        else
            printf ("not a substring\n");
    }
    return 0;
}





#include <stdio.h>
#include <string.h>

int main (void) {
	  char a [100], b [100], c;
	  if ((scanf ("%99[^\n]%c%99[^\n]", a, &c, b) == 3) && (c == '\n')) {
	    printf (strstr (a, b) ? "its a substring\n" : "not a substring\n");
	  }
	  return 0;
}


