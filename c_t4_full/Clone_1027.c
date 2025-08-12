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
#include <ctype.h>

bool vowels (char c) {
		    return (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' || c == 'A' || c == 'E' || c == 'I' || c == 'O');
		}

		void substr (char* src,int start_index, int end_index) {
		    for(int i = start_index; i < end_index; i++)
			printf ("%c", src[i]);
		    printf ("\n");
		}

		int main (int argc, const char *argv []) {
		    char str [] = "aeixaewwii";
		    int str_length = strlen (str);
		    int start_index = 0;
		    int end_index = 0;
		    bool containsVowel = false;
		    for(int x = 0; x <= str_length; x++) {
			char ch = str[x];
			if (vowels (ch) == false) {
			    end_index = x;
			    if (containsVowel)
				substr(str, start_index, end_index -1);
			    start_index = end_index + 1;
			    containsVowel = false;
			}
			else{
			    containsVowel = true;
			}
		    }
		    return 0;
}


