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
#define SIZE 100
int main() {
    char string[SIZE] = "";
    scanf("%s", string);
    if (!strstr(string, ".txt"))
        strcat(string, ".txt");
    printf("%s\n", string);
    return 0;
}


