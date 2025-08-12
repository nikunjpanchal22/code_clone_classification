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
#include<stdlib.h>
#include<string.h>
#include<stdint.h>

int main() {
    char* hexstring = "deadbeef10203040b00b1e50";
    int i;
    uint32_t bytearray[6];
    for(i=0; hexstring[i]!='\0'; i+=2) {
        sscanf(hexstring+i, "%02x", bytearray+(i/2));
        printf("bytearray[%d]: %02x\n", i/2, bytearray[i/2]);
    }
    return 0;
}


