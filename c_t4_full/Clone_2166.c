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



#include <ctype.h>
int main(int argc, char *argv[]) {
    int rc = 0;
    if (argc == 2)
        for (char *ptr = argv[1]; isdigit(*ptr); ++ptr)
            rc = rc * 10 + (*ptr - '0');
    return rc;
}


