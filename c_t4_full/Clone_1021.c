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





#include <stdbool.h>
#include <string.h>
#include <ctype.h>

bool vowel_check(char c) {
		    return (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' || c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U');
		}

		void substring(char *src, int start_index, int end_index) {
		    for(int i = start_index; i < end_index; i++)
			printf("%c", src[i]);
		    printf("\n");
		}

		int main(int argc, const char *argv[]) {
		    char str[] = "aeixaewwii";
		    int length = strlen(str);
		    int start_index = 0, end_index = 0;
		    bool vowelFound = false;
		    for (int x = 0; x <= length; x++) {
			char c = str[x];
			if (!vowel_check(c)) {
			    end_index = x;
			    if (vowelFound) substring(str, start_index, end_index - 1);
			    start_index = end_index + 1;
			    vowelFound = false;
			} else vowelFound = true;
		    }
		    return 0;
}


