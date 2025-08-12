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





#include <stdio.h>
#include <stdlib.h>
#include <string.h>

char** tokenize(const char *str) {
	    char *tmp = strdup(str);
	    char *tok = strtok(tmp, " ");
	    int count = 0;
	    while(tok) {
		tok = strtok(NULL, " ");
		count++;
	    }
	    free(tmp);
	    char** tokens = malloc(sizeof(char*) * (count + 1));
	    tmp = strdup(str);
	    tok = strtok(tmp, " ");
	    count = 0;
	    while(tok) {
		tokens[count++] = strdup(tok);
		tok = strtok(NULL, " ");
	    }
	    tokens[count] = NULL;
	    free(tmp);
	    return tokens;
}


