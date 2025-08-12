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
    printf("%X \n", c1);
    printf("%X \n", (unsigned char) 0xff);
    printf("%X \n", (unsigned short) 0xff);
    printf("%X \n", 0xff);
    printf("%X \n", c2);
    printf("%X \n", 0x44);
    printf("%X \n", 0x4411ff01);
    printf("%X \n", (unsigned short) c3);
    printf ("\n");
    return 0;
}


