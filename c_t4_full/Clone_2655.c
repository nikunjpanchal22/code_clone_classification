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
   printf("%s\n", ntohl(0x12345678) == 0x12345678 ? "big-endian" : ntohl(0x12345678) == 0x78563412 ? "little-endian" : "(stupid)-middle-endian");
   return 0;
}


