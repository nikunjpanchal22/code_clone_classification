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
    char *value = "4.56 bushel beans";
    char *remainder;
    double d = strtod(value, &remainder);
    if (remainder == value)
        printf("That's not a number.");
    else if (remainder[strspn(remainder, " \t\r\n")] != '\0')
        printf("Trailing characters after number.");
    else
        printf("Valid number: %lf", d);
    return 0;
}


