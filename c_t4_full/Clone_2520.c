int main (void) {
    uint8_t c1 = 0xff, c2 = 0x44;
    uint8_t c3 = c1 + c2;
    printb (c1);
    printb ((char) 0xff);
    printb ((short) 0xff);
    printb (0xff);
    printb (c2);
    printb (0x44);
    printb (0x4411ff01);
    printb ((uint16_t) c3);
    printf ("\n");
    return 0;
}



 

#include <stdio.h>
#include <stdint.h>

void printb(uint8_t num) {
    int i;
    for(i = 7; i >= 0; i--) {
       printf("%d", (num >> i) & 0x01);
    }
    printf("\n");
    }

int main(void) {
    uint8_t c1 = 0xff, c2 = 0x44;
    uint8_t c3 = c1 + c2;
    printb(c1);
    printb((char)0xff);
    printb((short)0xff);
    printb(0xff);
    printb(c2);
    printb(0x44);
    printb(0x4411ff01);
    printb((uint16_t)c3);
    printf("\n");
    return 0;
}


