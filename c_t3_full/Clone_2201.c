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
    char *s = "2.46 can of beans";
    char *t;
    double x = strtod(s, &t);
    if (t == s)
        printf("Invalid input.\n");
    else if (t[strspn(t, " \t\r\n")] != '\0')
        printf("Trailing characters present.\n");
    else
        printf("Number is %.2lf\n", x);
    return 0;
}


