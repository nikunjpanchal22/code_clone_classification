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

int main(void) {
	  char a[100], b[100], c;
	  fgets(a, sizeof(a), stdin);
	  c = getchar();
	  fgets(b, sizeof(b), stdin);
	  
	  if (c == '\n') {
	    if (strcasestr(a, b))
	      puts("its a substring");
	    else
	      puts("not a substring");
	  }
	  return 0;
}


