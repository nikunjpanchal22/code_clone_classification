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





#include <stdint.h>
#include <stdio.h>
#include <string.h>

uint8_t datas[9] = {0x20, 0x01, 0x03, 0xE0, 0x12, 0xFF, 0x00, 0x00, 0x00};
char binary[16][5] = {"0000", "0001", "0010", "0011",
                      "0100", "0101", "0110", "0111",
                      "1000", "1001", "1010", "1011",
                      "1100", "1101", "1110", "1111"};
int main(int argc, char **argv) {
    size_t data_elems = sizeof(datas)/sizeof(*datas);
    char result[1024] = "";
    for (size_t i = 0; i != data_elems; ++i) {
        strcat(result, binary[datas[i] >> 4]);
        strcat(result, binary[datas[i] & 0xF]);
    }
    printf("%s\n", result);
}


