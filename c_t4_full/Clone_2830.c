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
    long i, j, arr[2] = {0};

    if (argc > 2) {
        for (i = j = 1; i <= 2; i++, j++)
            arr[j-1] = strtol(argv[i], NULL, 0);
        printf ("%ld %ld", arr[0], arr[1]);
    }

    return 0;
}


