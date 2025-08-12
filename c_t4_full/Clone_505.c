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
    printf("%hhu \n", c1);
    printf("%hhu \n", (unsigned char) 0xff);
    printf("%hu \n", (unsigned short) 0xff);
    printf("%lu \n", (unsigned long) 0xff);
    printf("%hhu \n", c2);
    printf("%hhu \n", 0x44);
    printf("%lu \n", 0x4411ff01);
    printf("%hu \n", (unsigned short) c3);
    printf ("\n");
    return 0;
}


