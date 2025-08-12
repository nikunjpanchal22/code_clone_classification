int main () {
    if (ntohl (0x12345678) == 0x12345678) {
        printf ("big-endian\n");
    }
    else if (ntohl (0x12345678) == 0x78563412) {
        printf ("little-endian\n");
    }
    else {
        printf ("(stupid)-middle-endian\n");
    }
    return 0;
}





int main() {
    union {
        uint32_t i;
        char c[4];
    } bint = {0x00000001};

    if (ntohl(bint.i) == 0x12345678) printf("big-endian\n");
    else if (ntohl(bint.i) == 0x78563412) printf("little-endian\n");
    else printf("(stupid)-middle-endian\n");
    return 0;
}


