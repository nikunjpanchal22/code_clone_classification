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
    union {
        int x;
        unsigned char bytes[4];
    } data;
    data.x = 0x12345678;
    int big_endian = (data.bytes[3] << 24) | (data.bytes[2] << 16) | (data.bytes[1] << 8) | data.bytes[0];
    int little_endian = (data.bytes[0] << 24) | (data.bytes[1] << 16) | (data.bytes[2] << 8) | data.bytes[3];
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


