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
    char name[12], *altname;
    strcpy(name, "Hello World!");
    altname = (char*) calloc(strlen(name) + 1, sizeof(char));
    strcpy(altname, name);
    printf("%s\n%s\n", name, altname);
    free(altname);
    return 1;
}


