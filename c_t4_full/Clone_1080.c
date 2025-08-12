int main () {
    char *hexstring = "deadbeef10203040b00b1e50";
    int i;
    unsigned int bytearray [12];
    uint8_t str_len = strlen (hexstring);
    for (i = 0; i < (str_len / 2); i++) {
        sscanf (hexstring + 2 * i, "%02x", & bytearray [i]);
        printf ("bytearray %d: %02x\n", i, bytearray [i]);
    }
    return 0;
}





#include <stdio.h>
#include <stdint.h>
#include <string.h>

int main () {
    char hexstr[] = "deadbeef10203040b00b1e50";
    unsigned int bytearr[12];
    int i = 0;

    for (; i < strlen(hexstr)/2; i++) {
        sscanf(&hexstr[2 * i], "%02x", &bytearr[i]);
        printf ("bytearr %d: %02x\n", i, bytearr[i]);
    }
    return 0;
}


