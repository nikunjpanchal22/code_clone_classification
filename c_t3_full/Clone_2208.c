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





#include <string.h>
#include <stdlib.h>
#include <stdio.h>
 
int main() {
    char *line = "6.46 pint beans";
    char *extract;
    double val = strtod(line, &extract);
    if (extract == line)
        puts("Number is not valid");
    else if (*extract != '\0')
        puts("Extra characters after number");
    else 
        printf("Valid Double: %.2lf", val);
    return 0;
}


