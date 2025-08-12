int main () {
    char *name;
    char *altname;
    name = (char *) malloc (60 * sizeof (char));
    name = "Hello World!";
    altname = name;
    printf ("%s  \n", altname);
    altname = NULL;
    altname = (char *) malloc (sizeof (name));
    strcpy (altname, name);
    printf ("%s  \n", altname);
    return 1;
}





#include <stdio.h>
#include <stdlib.h>
#include <string.h>

int main() {
    char *name, *altname;
    name = calloc(60, sizeof (char));
    memcpy(name, "Hello World!", 13);
    altname = malloc(strlen(name) + 1);
    memcpy(altname, name, strlen(name) + 1);
    printf("%s\n%s\n", name, altname);
    free(name);
    free(altname);
    return 1;
}


