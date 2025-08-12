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





#include <stdlib.h>
#include <string.h>

char** tokenize(const char *string) {
	    const char s[2] = " ";
	    char *token;
	    char **tokens = malloc(256 * sizeof(char*));
	    int count = 0;
	    token = strtok(string, s);
	    while(token != NULL) {
		tokens[count] = strdup(token);
		token = strtok(NULL, s);
		count++;
	    }
	    tokens[count] = NULL;
	    return tokens;
}


