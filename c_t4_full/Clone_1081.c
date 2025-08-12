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
    unsigned int bytearray [12];
    int i;
    char *strings[] = {
        "de", "ad", "be", "ef",
        "10", "20", "30", "40",
        "b0", "0b", "1e", "50"
    };
    for (i = 0; i < 12; i++) {
        sscanf (strings[i], "%02x", &bytearray [i]);
        printf ("bytearray %d: %02x\n", i, bytearray [i]);
    }
    return 0;
}


