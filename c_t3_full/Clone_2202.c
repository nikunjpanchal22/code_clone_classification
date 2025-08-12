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
    char *num = "7.93 pound beans";
    char *next;
    double n = strtod(num, &next);
    if (next == num)
        puts("invalid number");
    else if (next[strspn(next, " \t\r\n")] != '\0')
        puts("non-whitespace trailing characters.");
    else
        printf("number: %.2lf\n", n);
    return 0;
}


