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

void reverse(char str[], int i, int j) {
		    while(i<j) {
			char temp = str[i];
			str[i] = str[j];
			str[j] = temp;
			i++; j--;
		    }
		}

		void reverseWords(char *sentence) {
		    int i = 0;
		    int len = strlen(sentence);
		    for(int j = 0; j < len; j++) {
			if(sentence[j] == ' ') {
			    reverse(sentence, i, j-1);
			    i = j + 1;
			}
			else if(j == len - 1) {
			    reverse(sentence, i, j);
			}
		    }
		}

		int main(void) {
		    char sentence[] = "this is a sentence";
		    reverseWords(sentence);
		    printf("%s\n", sentence);
		    return 0;
}


