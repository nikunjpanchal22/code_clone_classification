int main () {
    int i, j;
    char str [1000];
    scanf ("%s", str);
    for (i = 0; str[i] != '\0'; i++) {
        for (j = i + 1; str[j] != '\0'; j++) {
            if (str[i] == str[j]) {
                printf ("%c", str [i]);
                return 0;
            }
        }
    }
}



 


#include <stdio.h>
#include <string.h>
int main () {
	    int i = 0;
	    int j;
	    char str [1000];
	    scanf ("%s", str);
	    while(str[i]) {
		for (j = i + 1; str[j]; j++) {
		    if (str[i] == str[j]) {
		        printf ("%c", str [i]);
		        return 0;
		    }
		}
		i++;
	    }
}


