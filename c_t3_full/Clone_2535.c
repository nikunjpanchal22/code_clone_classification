int main () {
    char str [] = "test string.";
    char *firstname = strtok (str, " ");
    char *lastname = strtok (NULL, " ");
    if (!lastname)
        lastname = "";
    printf ("%s, %s\n", lastname, firstname);
    return 0;
}





#include <stdio.h>
#include <string.h>

int main () {
    char str[] = "Steve Rogers";
    char *name, *surname;
    name = strtok(str, " ");
    surname = strtok(NULL, " ");
    if (!surname)
        surname = "";
    printf ("%s, %s\n", surname, name);
    return 0;
}


