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




#include <stdlib.h>
int main(int argc, char *argv[]) {
    if (argc != 2)
        return 0;
    return atoi(argv[1]);
}


