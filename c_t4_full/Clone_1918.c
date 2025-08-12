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

char** tokenize(const char* input){
	    char *str = strdup(input);
	    int count = 0;
	    char* tmp = str;
	    char* last_comma = 0;
	    char delim[] = " ";

	    while (*tmp){
		if (delim[0] == *tmp){
		    count++;
		    last_comma = tmp;
		}
		tmp++;
	    }
	    count += last_comma < (str + strlen(str) - 1);
	    count++;
	    tmp = tmp - strlen(str);
	    char** result = (char**) malloc(sizeof(char*) * count);
	    if (result){
		size_t idx  = 0;
		char* token = strtok(str, delim);

		while (token){
		    assert(idx < count);
		    *(result + idx++) = strdup(token);
		    token = strtok(0, delim);
		}
		assert(idx == count - 1);
		*(result + idx) = 0;
	    }
	    free(str);
	    return result;
}


