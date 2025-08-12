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

void reversify(char *sentence, char *newSentence) {
		    int length = strlen(sentence);
		    int i, j, index = 0; 
		    for(i = length - 1; i >= 0; i--){
			if(sentence[i] == ' ' || i == 0){
			    for(j = i; j < length; j++, index++){
				newSentence[index] = sentence[j];
			    }
			    length = i;
			} 
		    } 
		    printf ("\n%s", newSentence);
		}

		int main (void) {
		    char sentence [] = "this is a sentence";
		    char *newSentence = (char *) calloc (strlen (sentence) +1,sizeof(char));
		    reversify(sentence, newSentence);
		    return 0;
}


