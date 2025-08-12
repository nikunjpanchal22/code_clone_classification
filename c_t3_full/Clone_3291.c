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
#define len 100
#define txt ".txt"
int main() {
    char s[len];
    scanf("%s", s);
    if (s[strlen(s) - 4] != *txt)
        strcat(s, txt);
    printf("%s\n", s);
    return 0;
}


