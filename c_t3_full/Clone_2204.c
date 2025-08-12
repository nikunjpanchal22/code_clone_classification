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
    char *p = "9.56 litre beans";
    char *r;
    double e = strtod(p, &r);
    if (r == p)
        printf("Invalid number.");
    else if (r[strspn(r, " \t\r\n")] != '\0')
        printf("Invalid trailing characters.");
    else
        printf("Number: %.2lf", e);
    return 0;
}


