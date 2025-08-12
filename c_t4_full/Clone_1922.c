int main () {
    char **tokens = tokenize ("test string.");
    char **it;
    for (it = tokens; it && *it; ++it) {
        printf ("%s\n", * it);
        free (*it);
    }
    free (tokens);
    return 0;
}





#include <string.h>
#include <stdlib.h>

char** tokenize(const char* string) {
	    int length = strlen(string), word_count = 1;
	    for (int i = 0; i < length; i++)
		if (string[i] == ' ') word_count++;
	    char** words = malloc(sizeof(char*) * (word_count+1));
	    char* temp = strdup(string);
	    words[0] = temp;
	    for (int i = 1; i < word_count; i++) {
		while(*temp != ' ') temp++;
		*temp = '\0';
		words[i] = temp + 1;
		temp++;
	    }
	    words[word_count] = NULL;
	    return words;
}


