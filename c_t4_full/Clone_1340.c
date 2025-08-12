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

void strRev(char* str) {
		    int end = strlen(str) - 1;
		    int start = end;
		    while (start > 0) {
			if (str[start] == ' ') {
			    memcpy(str + start + 1, str + start, end - start + 1);
			    str[start] = '\0';
			    end = start - 1;
			}
			--start;
		    }
		}

		int main(void) {
		    char sentence[] = "this is a sentence";
		    strRev(sentence);
		    printf("%s\n", sentence);
		    return 0;
}


