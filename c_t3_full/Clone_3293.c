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
    char str[100];
    scanf ("%s", str);
    if (!strstr(str, ".txt")) 
        strcat (str, ".txt");
    printf ("%s\n", str);
    return 0;
}


