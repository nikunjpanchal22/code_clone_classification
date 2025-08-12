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

void substr (char *src, int start_index, int end_index) {
		    for(int i = start_index; i <= end_index; i++)
		      printf ("%c", src[i]);
		    printf("\n");
		}

		int isVowel (char ch) {
		  char c = tolower(ch);
		  return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u';
		}

		int main (int argc, const char *argv []) {
		  char str [] = "aeixaewwii";
		  int length = strlen (str);
		  int start_index = 0, end_index = 0;
		  int wasVowel = 0;
		  for (int x = 0; x <= length; x++) {
		    char ch = str[x];
		    if (isVowel(ch) == 0) {
		      end_index = x;
		      if (wasVowel)
			substr(str, start_index, end_index -1);
		      start_index = end_index + 1;
		      wasVowel = 0;
		    }
		    else
		      wasVowel = 1;
		  }
		  return 0;
}


