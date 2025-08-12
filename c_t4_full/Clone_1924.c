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

char** tokenize(const char*s){
	   char* buf = malloc(strlen(s) + 1);//+1 for the zero-terminator
	   strcpy(buf, s);//for strtok    
	   int tokensCount = 0, i = 0;
	   for(int j = 0; s[j] != '\0'; j++){
	       if(s[j] == ' '){
		   tokensCount++;
	       }
	   }
	   tokensCount++;
	   char** arr = malloc(tokensCount * sizeof(char*));    
	   char* token = strtok(buf, " ");
	   while(token) {
		arr[i++] = strdup(token);
		token = strtok(0, " ");
	   }
	   arr[i] = 0;      
	   return arr;
}


