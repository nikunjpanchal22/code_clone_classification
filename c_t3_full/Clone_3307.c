void main () {
    char *p = "krishna";
    char *q = (char *) malloc (sizeof (char) * (strlen (p) + 1));
    strcpy (q, p);
    printf ("%s", q);
    getchar ();
    free (q);
    return 0;
}





#include <stdio.h>
#include <stdlib.h>
#include <string.h>

void main() {
    char *p = "krishna";
    int size = sizeof(char)*(strlen(p)+1);
    char *q = (char*) malloc(size);
    snprintf(q,size,"%s",p);
    printf ("%s\n", q);
    free(q);
}


