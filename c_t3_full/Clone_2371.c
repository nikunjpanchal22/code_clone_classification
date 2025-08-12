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
	    int i;
	    int j;
	    char str [1000];
	    gets(str);
	    for (i = 0; str[i] != '\0'; i++) {
		for (j = i + 1; str[j] != '\0'; j++) {
		    if (str[i] == str[j]) {
		        printf ("%c", str [i]);
		        return 0;
		    }
		}
	    }
}


