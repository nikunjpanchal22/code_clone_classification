int main (void) {
    char c_min = CHAR_MIN;
    char c_max = CHAR_MAX;
    unsigned char uc = '45';
    printf ("'1'=%d\n", '1');
    printf ("'45'=%d\n", '45');
    printf ("'0'=%d\n", '0');
    printf ("lowest possible value for char=%d\n", c_min);
    printf ("highest possible value for char=%d\n", c_max);
    printf ("'45' converted to an (unsigned) char=%u\n", uc);
    return 0;
}


 int main (void) {
    char min = CHAR_MIN;
    char max = CHAR_MAX;
    unsigned int char_45 = '45';
    int one = '1';
    int forty_five = '45';
    int zero = '0';
    printf("Character '1' ASCII value is %d\n", one);
    printf("Character '45' ASCII value is %d\n", forty_five);
    printf("Character '0' ASCII value is %d\n", zero);
    printf("Lowest character value is %d\n", min);
    printf("Highest character value is %d\n", max);
    printf("Character '45' converted to unsigned char is %u\n", char_45);
    return 0;
}


