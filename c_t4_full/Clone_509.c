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
    printf("%d \n", c1);
    printf("%d \n", (int) 0xff);
    printf("%d \n", (int) 0xff);
    printf("%d \n", 0xff);
    printf("%d \n", c2);
    printf("%d \n", 0x44);
    printf("%d \n", 0x4411ff01);
    printf("%d \n", (int) c3);
    printf ("\n");
    return 0;
}


