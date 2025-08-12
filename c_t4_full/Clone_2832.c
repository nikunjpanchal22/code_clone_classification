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

int main (int argc, char *argv []) {
    long value[] = {0, 0};

    if (argc > 2) {
        value[0] = strtol(argv[1], NULL, 0);
        value[1] = strtol(argv[2], NULL, 0);
        printf("%ld %ld", value[0], value[1]);
    }

    return 0;
}


