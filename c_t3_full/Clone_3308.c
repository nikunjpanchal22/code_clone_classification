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
    char *q = (char *) malloc(strlen(p) * sizeof(*q) + 1);
    strlcpy(q, p, strlen(p)+1);
    printf ("%s\n", q);
    free(q);
}


