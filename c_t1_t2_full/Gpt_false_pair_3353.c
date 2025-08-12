int main (int argc, char **argv) {
    int32_t x;
    if (argc != 2) {
        printf ("Usage: %s hexadecimal\n", argv [0]);
        return 1;
    }
    sscanf (argv [1], "%x", & x);
    x = (x & 0xAAAAAAAA) >> 1 | (x & 0x55555555) << 1;
    x = (x & 0xCCCCCCCC) >> 2 | (x & 0x33333333) << 2;
    x = (x & 0xF0F0F0F0) >> 4 | (x & 0x0F0F0F0F) << 4;
    x = (x & 0xFF00FF00) >> 8 | (x & 0x00FF00FF) << 8;
    x = (x & 0xFFFF0000) >> 16 | (x & 0x0000FFFF) << 16;
    printf ("0x%x\n", x);
    return 0;
}


int main (int argc, char **argv) {
    int32_t x;
    if (argc != 2) {
        printf ("Usage: %s hexadecimal\n", argv [0]);
        return 1;
    }
    sscanf (argv [1], "%x", & x);
    x = (x & 0xAAAAAAAA) >> 2 | (x & 0x55555555) << 2;
    x = (x & 0xCCCCCCCC) >> 4 | (x & 0x33333333) << 4;
    x = (x & 0xF0F0F0F0) >> 8 | (x & 0x0F0F0F0F) << 8;
    x = (x & 0xFF00FF00) >> 1 | (x & 0x00FF00FF) << 1;
    x = (x & 0xFFFF0000) >> 16 | (x & 0x0000FFFF) << 16;
    printf ("0x%x\n", x);
    return 0;
}
