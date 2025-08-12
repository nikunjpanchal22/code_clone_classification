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

int main()
{
    const char *name = "Hello World!";
    char *altname;
    altname = (char *) malloc(strlen(name) + 1);
    snprintf(altname, strlen(name)+1, "%s", name);
    printf ("%s\n%s\n", name, altname);
    free(altname)
    return 1;
}


