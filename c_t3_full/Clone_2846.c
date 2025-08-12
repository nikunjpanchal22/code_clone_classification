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
    uint32_t val = ntohl(0x12345678);
    uint32_t *p_val = &val;
    if (*p_val == 0x12345678) printf("big-endian\n");
    else if (*p_val == 0x78563412) printf("little-endian\n");
    else printf("(stupid)-middle-endian\n");
    return 0;
}


