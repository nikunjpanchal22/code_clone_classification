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

void reverse_word(char *start, char *end) {
		    char temp;
		    while (start < end) {
			temp = *start;
			*start++ = *end;
			*end-- = temp;
		    }
		}

		int main (void) {
		    char sentence[] = "this is a sentence";
		    char *newSentence = malloc (strlen(sentence) + 1);
		    char *word_begin = sentence;
		    char *temp = sentence; 
		    while (*temp) {
			temp++;
			if (*temp == '\0') {
			    reverse_word(word_begin, temp-1);
			} else if (*temp == ' ') {
			    reverse_word(word_begin, temp-1);
			    word_begin = temp+1;
			}
		    } 
		    printf("%s", sentence);
		    return 0;
}


