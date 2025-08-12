int main (void) {
    char str [] = "aaaaaaaa";
    size_t len_str = strlen (str);
    string *p = malloc (sizeof *p + len_str + 1);
    if (!p) {
        return 1;
    }
    p->size = len_str;
    strcpy (p -> str, str);
    puts (p -> str);
    strncpy (p -> str, str, len_str + 1);
    puts (p -> str);
    memcpy (p -> str, str, len_str + 1);
    puts (p -> str);
    free (p);
}




#include <stdio.h>
#include <stdlib.h>
#include <string.h>

typedef struct {
	    size_t size;
	    char *string; 
	} string;

	int main(void) {
	    char str[] = "aaaaaaaa";
	    size_t len_str = strlen(str);
	    
	    string *p = malloc(sizeof *p);
	    if (!p) {
		return 1;
	    }

	    p->size = len_str;
	    p->string = malloc(len_str + 1);
	    if (!p->string) {
		free(p);
		return 1;
	    }

	    strcpy(p->string, str);
	    puts(p->string);
	    strncpy(p->string, str, len_str + 1);
	    puts(p->string);
	    memcpy(p->string, str, len_str + 1);
	    puts(p->string);

	    free(p->string);
	    free(p);

	    return 0;
}


