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


 
int main (int argc, char *argv []) {
    int rc = 0;
    if (argc == 2) {
        int i = 0;
        while (argv[1][i] != '\0') {
            if (argv[1][i] >= '0' && argv[1][i] <= '9') {
                rc *= 10;
                rc += argv[1][i] - '0';
            }
            i++;
        }
    }
    return rc;
}


