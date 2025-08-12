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

int main () {
    char *name;
    char *altname;
    name = (char *) malloc (60 * sizeof (char));
    strcpy(name, "Hello World!");
    altname = name;
    printf ("%s  \n", altname);
    altname = NULL;
    altname = strdup(name);
    printf ("%s  \n", altname);
    free(name);
    free(altname);
    return 0;
}


