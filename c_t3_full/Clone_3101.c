int main (int argc, char *argv []) {
    unsigned int uValue;
    unsigned int uNibble;
    char sHexByte [3];
    sHexByte[2] = '\0';
    const char csHexChars [16] = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
    for (uValue = 0; uValue < 256U; uValue++) {
        uNibble = (uValue & 0xFFU) >> 4U;
        sHexByte[0] = csHexChars[uNibble];
        uNibble = uValue & 0x0FU;
        sHexByte[1] = csHexChars[uNibble];
        if (uValue > 0)
            putchar (':');
        fputs (sHexByte, stdout);
    }
    putchar ('\n');
    if (argv[0][1] == ' ')
        return argc;
    return 0;
}





#include<stdio.h>

int main(int argc, char *argv[]) {
    unsigned int val, nibble;
    char hexbyte[3] = {'\0'};
    const char hex_chars[17] = "0123456789abcdef";
    for(val = 0; val <= 0xFF; val++) {
        nibble = val / 16;
        hexbyte[0] = hex_chars[nibble];
        nibble = val % 16;
        hexbyte[1] = hex_chars[nibble];
        if(val > 0)
            putchar(':');
        printf("%s", hexbyte);
    }
    putchar ('\n');
    if (argv[0][1] == ' ')
        return argc;
    return 0;
}


