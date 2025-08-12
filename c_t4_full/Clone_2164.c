int main (int argc, char *argv []) {
    int rc = 0;
    if (argc == 2) {
        unsigned i = 0;
        while (argv[1][i] >= '0' && argv[1][i] <= '9') {
            rc *= 10;
            rc += argv[1][i] - '0';
            ++i;
        }
    }
    return rc;
}




#include <errno.h>
#include <string.h>
int main(int argc, char *argv[]) {
    int rc = 0;
    errno = 0;
    if (argc == 2) {
        char *end;
        rc = strtol(argv[1], &end, 10);
        if (errno != 0 || *end != '\0' || end == argv[1])
            rc = 0;
    }
    return rc;
}


