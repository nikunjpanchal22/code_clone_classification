int main (int argc, const char *argv []) {
    char str [] = "aeixaewwii";
    int length = strlen (str);
    int start_index = 0, end_index = 0;
    bool wasVowel = false;
    for (int x = 0; x <= length; x++) {
        char c = str[x];
        if (isVowel (c) == false) {
            end_index = x;
            if (wasVowel)
                substr (str, start_index, end_index -1);
            start_index = end_index + 1;
            wasVowel = false;
        }
        else
            wasVowel = true;
    }
    return 0;
}





#include <stdio.h>
#include <string.h>
#include <stdbool.h>
#include <ctype.h>

bool isVowel(char c) {
		    char lowerC = tolower(c);
		    return lowerC=='a' || lowerC=='e' || lowerC=='i' || lowerC=='o' || lowerC=='u';
		}

		void substr(char str[], int start, int end) {
		    int i;
		    for(i=start; i<end; i++) {
			printf("%c", str[i]);
		    }
		    printf("\n");
		}

		int main(int argc, const char *argv[]) {
		    char str[] = "aeixaewwii";
		    int length = strlen(str);
		    int start_index = 0, end_index = 0;
		    bool hasVowel = false;
		    for (int i = 0; i <= length; i++) {
			char c = str[i];
			if (!isVowel(c)) {
			    end_index = i;
			    if (hasVowel) substr(str, start_index, end_index - 1);
			    start_index = end_index + 1;
			    hasVowel = false;
			} else {
			    hasVowel = true;
			}
		    }
		    return 0;
}


