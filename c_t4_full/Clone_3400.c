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
    char fname[100] = {0};
    scanf("%99s", fname);
    char *suffix = ".txt";
    if (strcmp(fname + strlen(fname) - 4, suffix) != 0)
        strcat(fname, suffix);
    puts(fname);
    return 0;
}


