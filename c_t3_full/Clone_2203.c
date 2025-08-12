int main () {
    char *number = "5.53 garbanzo beans";
    char *foo;
    double d = strtod (number, &foo);
    if (foo == number) {
        printf ("invalid number.");
    }
    else if (foo[strspn (foo, " \t\r\n")] != '\0') {
        printf ("invalid (non-white-space) trailing characters.");
    }
    else {
        printf ("valid number: %lf", d);
    }
}





#include <stdio.h>
#include <stdlib.h>
#include <string.h>

int main() {
    char *amount = "3.14 kilolitre beans";
    char *extra;
    double d = strtod(amount, &extra);
    if (extra == amount)
        printf("That's not a number.");
    else if (extra[strspn(extra, " \t\r\n")] != '\0')
        printf("Non-whitespace characters are trailing.");
    else
        printf("That's a number: %.2lf\n", d);
    return 0;
}


