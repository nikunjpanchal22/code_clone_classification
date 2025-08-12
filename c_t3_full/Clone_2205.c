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
    char *input_string = "1.23 bag of beans";
    char *end_ptr;
    double d = strtod(input_string, &end_ptr);
    if (end_ptr == input_string)
        printf("That's not a valid number.");
    else if (end_ptr[strspn(end_ptr, " \t\r\n")] != '\0')
        printf("There are unnecessary characters following the number.");
    else
        printf("The number is valid: %.2lf\n", d);
    return 0;
}


