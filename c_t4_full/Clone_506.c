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
    cout << setbase( 16 ) <<  c1 << "\n";
    cout << (unsigned char) 0xff << "\n";
    cout << (unsigned short) 0xff << "\n";
    cout << 0xff << "\n";
    cout << c2 << "\n";
    cout << 0x44 << "\n";
    cout << 0x4411ff01 << "\n";
    cout << (unsigned short) c3 << "\n";
    cout << "\n";
    return 0;
}


