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





#include<stdio.h>
#include<string.h>

int main() {
    char* hexstr = "deadbeef10203040b00b1e50";
    unsigned int bytearray[12];
    int i = sizeof(bytearray)/sizeof(bytearray[0]);
    while(i--) {
        sscanf(hexstr+2*i, "%2x", bytearray + i);
        printf("bytearray[%d]: %02x\n", i, bytearray[i]);
    }
    return 0;
}


