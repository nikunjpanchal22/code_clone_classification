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
int main() {
    char *s = calloc(100, 1);
    fgets(s, 100, stdin);
    if (!strstr(s, ".txt"))
        strcat(s, ".txt");
    printf("%s", s);
    free(s);
    return 0;
}


