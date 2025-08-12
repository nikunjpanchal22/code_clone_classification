int main (int argc, char *argv []) {
    long a, b;
    if (argc > 2) {
        a = strtol (argv[1], NULL, 0);
        b = strtol (argv[2], NULL, 0);
        printf ("%ld %ld", a, b);
    }
    return 0;
}





#include <stdio.h>
#include <stdlib.h>

#define GET_NUM(arg) (strtol (arg, NULL, 0))

int main (int argc, char *argv []) {
    if (argc > 2)
        printf ("%ld %ld", GET_NUM(argv[1]), GET_NUM(argv[2]));
    return 0;
}


