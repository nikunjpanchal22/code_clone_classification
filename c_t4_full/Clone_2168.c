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



_cpp
#include <cstdio>
int main(int argc, char* argv[]) {
    int res;
    if (argc == 2) 
        sscanf(argv[1], "%d", &res);
    return res;
}


