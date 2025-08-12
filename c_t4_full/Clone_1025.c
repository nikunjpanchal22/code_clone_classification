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
		    char lc = tolower(c);
		    return lc=='a' || lc=='e' || lc=='i' || lc=='o' || lc=='u';
		}

		void substr(char str[], int first, int last) {
		    for(int i=first; i<last; i++) {
			printf("%c", str[i]);
		    }
		    printf("\n");
		}

		int main(int argc, const char *argv[]) {
		    char str[] = "aeixaewwii";
		    int length = strlen(str);
		    int start_index = 0, end_index = 0;
		    bool wasVowel = false;
		    for (int x = 0; x <= length; x++) {
			char c = str[x];
			if (isVowel(c) == false) {
			    end_index = x;
			    if (wasVowel)
				substr(str, start_index, end_index - 1);
			    start_index = end_index + 1;
			    wasVowel = false;
			}
			else {
			    wasVowel = true;
			}
		    }
		    return 0;
}


