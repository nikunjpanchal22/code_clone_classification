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
    char* endians[3] = { "big-endian\n", "little-endian\n","(stupid)-middle-endian\n" };
    printf("%s", endians[ntohl(0x12345678)== 0x12345678 ? 0 : ntohl(0x12345678) == 0x78563412 ? 1 : 2]);
    return 0;
}


