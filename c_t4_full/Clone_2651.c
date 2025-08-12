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
    switch(ntohl(0x12345678)) {
        case 0x12345678: printf("big-endian\n"); break;
        case 0x78563412: printf("little-endian\n"); break;
        default: printf("(stupid)-middle-endian\n"); break;
    }
    return 0;
}


