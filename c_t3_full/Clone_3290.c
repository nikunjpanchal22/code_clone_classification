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
    char input[100];
    scanf("%s", input);
    if (strcmp(&input[strlen(input) - 4], ".txt"))
        strcat(input, ".txt");
    printf("%s\n", input);
    return 0;
}


