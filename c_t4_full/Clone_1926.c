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
#include <string.h>
#include <stdlib.h>

char** tokenize(const char *str){
	    int count = 0;
	    const char s[2] = " ";
	    char *token;
	    char *temp = strdup(str);
	    char **tokens = malloc((count+1)*sizeof(char*));
	    token = strtok(temp, s);
	    while( token != NULL ) {
		tokens[count] = strdup(token);
		token = strtok(NULL, " ");
		count++;
		tokens = realloc(tokens, (count+1)*sizeof(char*));
	    }
	    tokens[count] = NULL;
	    return tokens;
}


