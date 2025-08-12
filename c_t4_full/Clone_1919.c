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

char** tokenize(const char *inputStr){
	    char *str = strdup(inputStr);
	    char **result = NULL;
	    int spacecount = 0;
	    int i = 0;

	    for(i = 0; str[i]; i++){
		if(str[i] == ' '){
		    spacecount++;
		}
	    }

	    result = malloc(sizeof(char*) * (spacecount + 2));
	    if(result){
		int idx  = 0;
		char* token = strtok(str, " ");

		while(token){
		    assert(idx < spacecount + 2);
		    *(result + idx++) = strdup(token);
		    token = strtok(0, " ");
		}
		assert(idx == spacecount + 1);
		*(result + idx) = 0;
	    }

	    free(str);
	    return result;
}


