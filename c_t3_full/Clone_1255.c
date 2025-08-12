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
    int x, y, z;
    x = 0x12345678;
    y = x >> 24 | x << 24;
    z = (x & 0x00FF0000) >> 8 | (x & 0x0000FF00) << 8;
    if (y == 0x12345678) {
        printf ("big-endian\n");
    }
    else if (z == 0x12345678) {
        printf ("little-endian\n");
    }
    else {
        printf ("(stupid)-middle-endian\n");
    }
    return 0;
} 


