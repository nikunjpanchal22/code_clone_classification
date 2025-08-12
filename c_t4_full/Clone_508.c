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


 int main (void) {
    uint8_t c1 = 0xff, c2 = 0x44;
    uint8_t c3 = c1 + c2;
    printf("%u \n", c1);
    printf("%u \n", (unsigned char) 0xff);
    printf("%u \n", (unsigned short) 0xff);
    printf("%u \n", (unsigned int) 0xff);
    printf("%u \n", c2);
    printf("%u \n", 0x44);
    printf("%u \n", 0x4411ff01);
    printf("%hu \n", (unsigned short) c3);
    printf ("\n");
    return 0;
}


