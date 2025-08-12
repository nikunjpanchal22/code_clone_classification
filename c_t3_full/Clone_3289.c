int main (void) {
    int SIZE = 100;
    char string [SIZE];
    scanf ("%s", string);
    if (strcmp (&(string[strlen (string) - 4]), ".txt"))
        strcat (string, ".txt");
    printf ("%s\n", string);
    return 0;
}





#include <stdio.h>
#include <string.h>
#include <stdlib.h>
int main() {
    char *string = malloc(100);
    scanf("%s", string);
    if ("txt" != strstr(string + strlen(string) - 4, "txt")) 
        strcat(string, ".txt");
    printf("%s\n", string);
    free(string);
    return 0;
}


