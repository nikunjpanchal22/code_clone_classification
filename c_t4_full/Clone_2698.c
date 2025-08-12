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
#include <stdlib.h>
#include <string.h>
#define LENGTH 100

int main() {
    char *name = (char *)malloc(LENGTH * sizeof(char));
    fgets(name, LENGTH, stdin);
    printf("%ld\n", strlen(name)-1);
    free(name);
}


