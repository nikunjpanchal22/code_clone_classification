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
int main(void) {
    char string[100] = {0};
    char *key = ".txt";
    fgets(string, sizeof string, stdin);
    if (strstr(string, key) == NULL)
        strcat(string, key);
    printf("%s\n", string);
    return 0;
}


