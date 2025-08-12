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





#include <string.h>
#include <stdbool.h>

bool isVowel(char c) {
		    return (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' || c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U');
		}

		void substr(char *src, int m, int n) {
		    int i = m;
		    while (i < n) {
			printf("%c", src[i]);
			i++;
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


