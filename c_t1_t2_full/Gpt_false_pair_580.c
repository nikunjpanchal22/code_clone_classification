main (int argc, char **argv) {
    unsigned char datas [9] = {0x20, 0x01, 0x03, 0xE0, 0X12, 0XFF, 0, 0, 0};
    int numElements = sizeof (datas) / sizeof (datas[0]);
    char result [1024];
    unsigned char temp = 0, loop = 0;
    unsigned char *p;
    unsigned char binary [16] [5] = {"0000", "0001", "0010", "0011", "0100", "0101", "0110", "0111", "1000", "1001", "1010", "1011", "1100", "1101", "1110", "1111"};
    result[0] = '\0';
    for (loop = 0; loop < numElements; ++loop) {
        temp = datas[loop];
        temp = temp >> 4;
        p = binary[temp];
        strcat (result, p);
        temp = datas[loop];
        temp = temp & 0x0F;
        p = binary[temp];
        strcat (result, p);
    }
    printf ("\n%s\n", result);
}



main (int argc, char **argv) {
    unsigned char datas [9] = {0x20, 0x01, 0x03, 0xE0, 0X12, 0XFF, 0, 0, 0};
    int numElements = sizeof (datas) / sizeof (datas[0]);
    char result [1024];
    unsigned char temp = 0, loop = 0;
    unsigned char *p;
    unsigned char binary [16] [5] = {"0000", "0001", "0010", "0011", "0100", "0101", "0110", "0111", "1000", "1001", "1010", "1011", "1100", "1101", "1110", "1111"};
    result[0] = '\0';
    for (loop = 0; loop < numElements; ++loop) {
        temp = datas[loop];
        int ls_nibble = temp & 0x0F;
        int ms_nibble = temp >> 4;
        p = binary[ms_nibble];
        strcat (result, p);
        p = binary[ls_nibble];
        strcat (result, p);
    }
    printf ("\n%s\n", result);
}
