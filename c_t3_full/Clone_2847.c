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
    volatile unsigned long val = ntohl(0x12345678);
    if (val == 0x12345678) printf("big-endian\n");
    else if (val == 0x78563412) printf("little-endian\n");
    else printf("(stupid)-middle-endian\n");
    return 0;
}


