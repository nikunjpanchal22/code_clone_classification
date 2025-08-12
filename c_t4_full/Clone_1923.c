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

char** tokenize(const char* string){
	    const char delimiter[] = " ";
	    char* s = strdup(string);
	    size_t count = 0;
	    for(char* temp = s; temp; temp = strpbrk(temp + 1, delimiter))
		count++;
	    {
		char** result = malloc((count + 2) * sizeof *result);
		size_t i;
		char* token = strtok(s, delimiter);

		for(i = 0; token; i++){
		    result[i] = token;
		    token = strtok(NULL, delimiter);
		}

		result[i] = NULL;
		result[count + 1] = s;
		return result;
	    }
}


