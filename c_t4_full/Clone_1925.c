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

char **tokenize(const char *string) {
	    char *str = strdup(string);
	    char **tokens = NULL;
	    char *token;
	    size_t ntokens = 0;
	    token = strtok(str," ");
	    while(token != NULL) {
	       tokens = realloc(tokens, sizeof(char*) * (ntokens+1));
	       tokens[ntokens++] = strdup(token);
	       token = strtok(NULL," ");
	    }
	    tokens = realloc(tokens, sizeof(char*) * (ntokens+1));
	    tokens[ntokens] = NULL;
	    free(str);
	    return tokens;
}


