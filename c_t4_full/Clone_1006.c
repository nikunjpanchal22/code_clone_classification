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
#include <stdbool.h>
#include <string.h>
#define isVowel(c) ((c=='a')||(c=='e')||(c=='i')||(c=='o')||(c=='u'))

// Substring function
char* substr(char* str, int start, int end) {
   char* substring = malloc(sizeof(char)*(end - start + 2));
   memcpy(substring, &str[start], end - start + 1);
   substring[end - start + 1] = '\0';
   return substring;
}


