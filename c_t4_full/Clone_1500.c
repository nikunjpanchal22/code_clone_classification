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

#define SIZE 9

uint8_t bin [16] [5] = {"0000","0001","0010","0011","0100","0101","0110","0111","1000","1001","1010","1011","1100","1101","1110","1111"};
        
uint8_t datas [SIZE] = {
    32,    /* 0x20 */
    1,     /* 0x01 */
    3,     /* 0x03 */
    224,   /* 0xE0 */
    18,    /* 0x12 */
    255,   /* 0xFF */
    0,     /* 0x00 */
    0,     /* 0x00 */
    0      /* 0x00 */
};

char result [2048];

int main (int argc, char **argv) {
    memset(result, '\0', sizeof(result));
    for (int i = 0; i < SIZE; ++i)
    {
        uint8_t upper = datas[i] >> 4;
        strcat(result, bin[upper]);
        uint8_t lower = datas[i] & 0x0F;
        strcat(result, bin[lower]);
    }
    printf("%s\n", result);
    return 0;
}


