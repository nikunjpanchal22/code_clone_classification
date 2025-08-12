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
    char *n = "0.98 yard beans";
    char *err;
    double q = strtod(n, &err);
    if (err == n)
        printf("This is not a valid number.");
    else if (err[strspn(err, " \t\r\n")] != '\0')
        printf("Trailing characters present.");
    else
        printf("valid number: %lf", q);
    return 0;
}


