int main (int argC, char *argV []) {
    char *name = malloc (MAX_NAME_SZ);
    if (name == NULL) {
        printf ("No memory\n");
        return 1;
    }
    printf ("What is your name? ");
    fgets (name, MAX_NAME_SZ, stdin);
    if ((strlen (name) > 0) && (name[strlen (name) - 1] == '\n'))
        name[strlen (name) - 1] = '\0';
    printf ("Hello %s. Nice to meet you.\n", name);
    free (name);
    return 0;
}





#define _GNU_SOURCE
#include <string.h>
#include <stdlib.h>

int main (void) {
	ssize_t buf;
  	size_t n = MAX_NAME_SZ - 1;
  	char *name = malloc(n);
  	if (!name) {
    	perror("No memory");
    	return 1;
  	}
  	printf("What is your name? ");
  	buf = getline(&name, &n, stdin);
  	if (buf > 0)
		name[buf - 1] = '\0';
  	printf("Hello %s. Nice to meet you.\n", name);
  	free(name);
  	return 0;
}


