int main (void) {
    char sentence [] = "this is a sentence";
    char *newSentence = (char *) malloc (strlen (sentence) +1);
    int i, j, start, k;
    start = 0;
    for (i = 0;; i++) {
        if (sentence[i] == ' ' || sentence[i] == '\0') {
            char *word = (char *) malloc ((i - start) + 1);
            for (j = i - 1, k = 0; j >= start; j--, k++) {
                word[k] = sentence[j];
            }
            word[k++] = ' ';
            word[k] = '\0';
            strcat (newSentence, word);
            start = i + 1;
        }
        if (sentence[i] == '\0')
            break;
    }
    printf ("%s\n", newSentence);
    return 0;
}





#include <stdio.h>
#include <stdlib.h>
#include <string.h>

char *reverseWord(char *str) {
		    int i, j, k;
		    for (i = strlen(str)-1; i >= 0; i--) {
			if (str[i] == ' ') {
			    continue;
			}
			else {
			    j=i;
			    while (i >= 0 && str[i] != ' ') {
				i--;
			    }
			    for(k = i+1; k <= j; k++) {
				putchar(str[k]);
			    }
			    printf(" ");
			}
		    }
		    return str;
		}

		int main (void) {
		    char sentence [] = "this is a sentence";
		    reverseWord(sentence);
		    return 0;
}


