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
    long nums[2] = {0};

    for (int i = 1; i < argc && i < 3; ++i)
        nums[i-1] = strtol(argv[i], NULL, 0);

    if (argc > 2)
        printf ("%ld %ld", nums[0], nums[1]);

    return 0;
}


