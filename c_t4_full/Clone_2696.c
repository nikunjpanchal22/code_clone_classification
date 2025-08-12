int main () {
    char *name = malloc (sizeof (char) * LENGTH);
    int n;
    printf ("\nenter the string\n");
    scanf ("%s", name);
    n = strlen (name);
    printf ("%d", n);
    free (name);
}





#include <stdio.h>
#include <string.h>
#include <stdlib.h>
#define LENGTH 101

int main() {
    char *name = (char*)malloc(sizeof(char) * LENGTH);
    fscanf(stdin, "%s", name);
    printf("%ld\n", strlen(name));
    free(name);
}


