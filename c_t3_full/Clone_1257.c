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
    int x = 0x12345678; 
    x = (x << 24 | (x << 8) & 0x00ff0000 | (x >> 8) & 0x0000ff00 | x >> 24) & 0xffffffff;
    if (x == 0x12345678) {
        printf ("big-endian\n");
    }
    else if (x == 0x78563412) {
        printf ("little-endian\n");
    }
    else {
        printf ("(stupid)-middle-endian\n");
    }
    return 0;
}


