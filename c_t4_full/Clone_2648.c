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
    if (ntohl(0x12345678) == 0x12345678) goto big;
    else if (ntohl(0x12345678) == 0x78563412) goto little;
    else goto middle;
    
    big:
    printf("big-endian\n");
    return 0;

    little:
    printf("little-endian\n");
    return 0;

    middle:
    printf("(stupid)-middle-endian\n");
    return 0;
}


