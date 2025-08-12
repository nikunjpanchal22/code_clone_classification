Clone_1008.c	1.417808219	0.9410641	0.655399488	0.745831082


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

bool isVowel(char c) { 
    return (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' ||
            c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U'); 
}


