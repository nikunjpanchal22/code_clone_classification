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
    wchar_t uc1 = c1;
    wchar_t uc2 = (unsigned char) 0xff;
    wchar_t uc3 = (unsigned short) 0xff;
    wchar_t uc4 = 0xff;
    wchar_t uc5 = c2;
    wchar_t uc6 = 0x44;
    wchar_t uc7 = 0x4411ff01;
    wchar_t uc8 = (unsigned short) c3;
    wprintf(L"%lc \n", uc1);
    wprintf(L"%lc \n", uc2);
    wprintf(L"%lc \n", uc3);
    wprintf(L"%lc \n", uc4);
    wprintf(L"%lc \n", uc5);
    wprintf(L"%lc \n", uc6);
    wprintf(L"%lc \n", uc7);
    wprintf(L"%lc \n", uc8);
    printf ("\n");
    return 0;
}


