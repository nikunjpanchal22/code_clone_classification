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


 int main(){
    if (__bswap_32 (0x12345678) == 0x12345678) {
        printf ("big-endian\n");
    }
    else if (__bswap_32 (0x12345678) == 0x78563412) {
        printf ("little-endian\n");
    }
    else {
        printf ("(stupid)-middle-endian\n");
    }
    return 0;
}
