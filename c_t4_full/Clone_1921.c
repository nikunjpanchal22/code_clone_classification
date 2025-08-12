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

char** tokenize(const char *str){
	    int spaces = 0, token_index = 0, letter_index = 0;
	    for(int i = 0; i<strlen(str); i++)
		if(str[i] == ' ') spaces++;
	    char** tokens = malloc((spaces+1)*sizeof(char*));
	    for(int i = 0; i<=spaces; i++)
		tokens[i] = malloc(20*sizeof(char));
	    for(int i = 0; i<strlen(str); i++){
		if(str[i] != ' ')
		    tokens[token_index][letter_index++] = str[i];
		else{
		    tokens[token_index][letter_index] = '\0';
		    token_index++;
		    letter_index = 0;
		}
	    }
	    return tokens;
}


