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
    char *p = (char *)&(0x12345678);
    int big_endian = p[3] << 24 | p[2] << 16 | p[1] << 8 | p[0];
    int little_endian = p[0] << 24 | p[1] << 16 | p[2] << 8 | p[3];
    if (big_endian == 0x12345678) {
        printf ("big-endian\n");
    }
    else if (little_endian == 0x12345678) {
        printf ("little-endian\n");
    }
    else {
        printf ("(stupid)-middle-endian\n");
    }
    return 0;
}


