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





#include <stdio.h>
#include <stdint.h>
int main(int argc, char **argv) {
    int32_t val;
    if(argc != 2) {
        fprintf(stderr, "Usage: %s hexadecimal\n", argv[0]);
        return 1;
    }
    sscanf(argv[1], "%x", &val);
    val = (val & 0x55555555) << 1 | (val & 0xAAAAAAAA) >> 1;
    val = (val & 0x33333333) << 2 | (val & 0xCCCCCCCC) >> 2;
    val = (val & 0x0F0F0F0F) << 4 | (val & 0xF0F0F0F0) >> 4;
    val = (val & 0x00FF00FF) << 8 | (val & 0xFF00FF00) >> 8;
    val = (val & 0x0000FFFF) << 16 | (val & 0xFFFF0000) >> 16;
    printf("0x%x\n", val);
    return 0;
}


