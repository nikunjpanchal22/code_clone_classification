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
    char *q = malloc(strlen(p)*sizeof(char)+1);
    strncpy(q,p,strlen(p));
    q[strlen(p)]='\0';
    puts(q);
    free(q);
}


