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
    char text[100];
    fgets(text, 100, stdin);
    char *pos;
    if ((pos=strchr(text, '\n')) != NULL)
        *pos = '\0';
    if (strstr(text, ".txt") == NULL)
        strcat(text, ".txt");
    printf("%s\n", text);
    return 0;
}


