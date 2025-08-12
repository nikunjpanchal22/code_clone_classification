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
    int x =ntohl(0x12345678); 
    int first = (x >> 24) & 0xff;
    int second = (x >> 16) & 0xff;
    int third = (x >> 8) & 0xff;
    int fourth = x & 0xff;
    if (first == 0x12 && second == 0x34 && third == 0x56 && fourth == 0x78) {
        printf ("big-endian\n");
    }
    else if (first == 0x78 && second == 0x56 && third == 0x34 && fourth == 0x12) {
        printf ("little-endian\n");
    }
    else {
        printf ("(stupid)-middle-endian\n");
    }
    return 0;
}


