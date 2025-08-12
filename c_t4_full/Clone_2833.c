
Clone_2833.c	1.433500627	0.9869553	0.663462116	0.751282625

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
    long i[2] = {0};

    if (argc > 2) {
        i[0] = strtol (argv[1], NULL, 0);
        i[1] = strtol (argv[2], NULL, 0);
        printf ("%ld %ld", i[0], i[1]);
    }

    return 0;
}


