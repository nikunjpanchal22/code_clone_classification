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
    unsigned int x = 0x12345678, r = 0;
    r |= (x & 0x000000FF) << 24;
    r |= (x & 0x0000FF00) << 8;
    r |= (x & 0x00FF0000) >> 8;
    r |= (x & 0xFF000000) >> 24;
    if (r == 0x12345678) {
        printf ("big-endian\n");
    }
    else if (r == 0x78563412) {
        printf ("little-endian\n");
    }
    else {
        printf ("(stupid)-middle-endian\n");
    }
    return 0;
}


