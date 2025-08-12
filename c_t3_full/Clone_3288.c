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
    char strng[100];
    scanf("%s", strng);
    size_t len = strlen(strng);
    if (len < 4 || strcmp(strng + len - 4, ".txt"))
        strcat(strng, ".txt");
    puts(strng);
    return 0;
}


