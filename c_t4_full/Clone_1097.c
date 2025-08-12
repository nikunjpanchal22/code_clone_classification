int main (int argc, char **argv) {
    const char hexstring [] = "DEadbeef10203040b00b1e50", *pos = hexstring;
    unsigned char val [12];
    for (size_t count = 0; count < sizeof val / sizeof *val; count++) {
        sscanf (pos, "%2hhx", & val [count]);
        pos += 2;
    }
    printf ("0x");
    for (size_t count = 0; count < sizeof val / sizeof *val; count++)
        printf ("%02x", val[count]);
    printf ("\n");
    return 0;
}



 

#include <stdio.h>

int main(void) 
{
    const char hex[25] = "DEADBEeF10203040b00b1e50";
    unsigned char value[12];
    for(int i = 0; i < 24; i+=2)
        sscanf(hex+i, "%2hhX", &value[i/2]);
    for(int i = 0; i < 12; i++)
        printf("0x%02X ", value[i]);
    return 0;
}


