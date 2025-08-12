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
    char *q = (char*) malloc(sizeof(char)*(strlen(p)+1));
    for(int i=0; p[i]!='\0';++i) q[i]=p[i];
    q[strlen(p)]='\0';
    printf ("%s\n", q);
    free(q);
}


