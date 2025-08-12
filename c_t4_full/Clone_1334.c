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

int main (void) {
	    char sentence[] = "this is a sentence";
	    int len = strlen(sentence);
	    int i, j = len - 1, k, start = len - 1;
	    char newSentence[len+1]; 
	    for (i = len - 1; i >= 0; i--) {        
		if (sentence[i] == ' ' || i == 0) {
		    start = (i==0)? i : i+1;
		    for (k = start; k <= j; k++) {
		        newSentence[len - 1 - (--j)] = sentence[k];
		    }
		    newSentence[len - 1 - j] = ' ';
		}
	    }
	    newSentence[len] = '\0';
	    printf("\n%s", newSentence);
	    return 0;
}


