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





#include <ctype.h>
#include <string.h>

void substr (char *src, int start_idx, int end_idx) {
		    for(int i = start_idx; i < end_idx; i++)
			printf("%c", src[i]);
		    printf("\n");
		}

		int is_vowel (char ch) {
		    char c = tolower(ch);
		    return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u';
		}

		int main (int argc, const char *argv []) {
		    char str [] = "aeixaewwii";
		    int length = strlen(str);
		    int start_index = 0, end_index = 0;
		    int vowelFound = 0;
		    for (int x = 0; x <= length; x++) {
			char c = str[x];
			if (!is_vowel(c)) {
			    end_index = x;
			    if (vowelFound)
				substr(str, start_index, end_index - 1);
			    start_index = end_index + 1;
			    vowelFound = 0;
			} else 
			    vowelFound = 1;
		    }
		    return 0;
}


