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
    char *name = (char*)calloc(LENGTH, sizeof(char));
    printf("Enter name: ");
    scanf("%[^\n]s", name);
    printf("%zu", strlen(name));
    free(name);
}


