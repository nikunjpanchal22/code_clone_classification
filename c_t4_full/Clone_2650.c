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





#define ENDIAN(val) ntohl(val)==0x12345678?"big-endian\n":ntohl(val)==0x78563412?"little-endian\n":"(stupid)-middle-endian\n"
int main() {
    printf("%s", ENDIAN(0x12345678));
    return 0;
}


