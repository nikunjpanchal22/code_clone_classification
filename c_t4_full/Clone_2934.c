int main () {
    int x, y;
    for (;;) {
        x = poll (&attention, 1, 100);
        if (x < 0) {
            printf ("problem %d\n", errno);
            break;
        }
        else if (x) {
            printf ("you rang %x ?", x);
            y = getc (stdin);
            printf (" %c of course\n", y);
            if (y == '.')
                break;
        }
    }
    return 0;
}





#include <cstdio>
#include <stdlib.h>
#include <cerrno>
#include <poll.h>

int main () {
    struct pollfd attention;
    attention.fd = 0; // standard input
    attention.events = POLLIN; // there's data to read

    int x, y;
    while (true) {
        x = poll (&attention, 1, 100);
        if (x < 0) {
            perror("Error");
            exit(EXIT_FAILURE);
        } else if (x > 0) {
            fprintf (stdout, "you rang %x ?", x);
            y = getc (stdin);
            fprintf (stdout, " %c of course\n", y);
            if (y == '.') break;
        }
    }

    exit(EXIT_SUCCESS);
}


