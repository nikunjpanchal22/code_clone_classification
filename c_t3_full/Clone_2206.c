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





#include <stdlib.h>
#include <string.h>
#include <stdio.h>

int main() {
    char *src = "8.33 kilogram beans";
    char *temp;
    double d = strtod(src, &temp);
    if (temp == src)
        printf("This is not a valid number.");
    else if (temp[strspn(temp, " \t\r\n")] != '\0')
        printf("Non-whitespace characters present.\n");
    else
        printf("Number: %lf\n", d);
    return 0;
}


